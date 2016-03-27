//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;
import com.example.user.mediaplayer.backend.MuseStuff.AndroidConnectionHandle;
import com.example.user.mediaplayer.backend.MuseStuff.ConnectionHandle;
import com.example.user.mediaplayer.backend.MuseStuff.ConnectionState;
import com.example.user.mediaplayer.backend.MuseStuff.Muse;
import com.example.user.mediaplayer.backend.MuseStuff.MuseManager;
import com.example.user.mediaplayer.backend.MuseStuff.MusePlatformInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

final class MusePlatformAndroid extends MusePlatformInterface {
    private static final String TAG = "libmuse platform";
    private static final int READ_SIZE = 256;
    private WeakReference<Muse> weakMuse = null;
    private final Object LOCK = new Object();
    private Thread asyncExecutionThread = null;
    private final AtomicBoolean continueExecution = new AtomicBoolean(false);
    private final AtomicBoolean alreadyReturnedConnectionHandle = new AtomicBoolean(false);
    private static final UUID M42_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private String macAddress;
    private final BluetoothAdapter mAdapter;
    private BluetoothSocket mSocket = null;
    private byte[] buffer;

    MusePlatformAndroid(String macAddress) {
        this.macAddress = macAddress;
        this.buffer = new byte[256];
        this.mAdapter = MuseManager.getDefaultBluetoothAdapter();
    }

    void setMuse(WeakReference<Muse> weakMuse) {
        this.weakMuse = weakMuse;
    }

    public void runAsynchronously() {
        Object var1 = this.LOCK;
        synchronized(this.LOCK) {
            final Muse muse = (Muse)this.weakMuse.get();
            if(muse != null && (this.asyncExecutionThread == null || !this.asyncExecutionThread.isAlive())) {
                this.asyncExecutionThread = new Thread(new Runnable() {
                    public void run() {
                        muse.connect();
                        MusePlatformAndroid.this.continueExecution.set(true);

                        while(MusePlatformAndroid.this.continueExecution.get() && (muse.getConnectionState() == ConnectionState.CONNECTING || muse.getConnectionState() == ConnectionState.CONNECTED)) {
                            try {
                                Thread.sleep(20L);
                            } catch (InterruptedException var2) {
                                break;
                            }

                            muse.execute();
                            if(Thread.currentThread() != MusePlatformAndroid.this.asyncExecutionThread) {
                                break;
                            }
                        }

                    }
                });
                this.asyncExecutionThread.start();
            }

        }
    }

    public boolean connect() {
        BluetoothDevice device = this.mAdapter.getRemoteDevice(this.macAddress);
        BluetoothSocket tmp = null;
        this.mSocket = null;

        try {
            tmp = device.createRfcommSocketToServiceRecord(M42_UUID);
        } catch (IOException var5) {
            Log.e("libmuse platform", "create() failed", var5);
            return false;
        }

        this.mSocket = tmp;
        this.mAdapter.cancelDiscovery();

        try {
            this.mSocket.connect();
            return true;
        } catch (IOException var4) {
            Log.w("libmuse platform", "connect() failed", var4);
            return false;
        }
    }

    public void disconnect() {
        try {
            if(this.mSocket != null) {
                this.continueExecution.set(false);
                Object e = this.LOCK;
                synchronized(this.LOCK) {
                    if(Thread.currentThread() != this.asyncExecutionThread && this.asyncExecutionThread != null && this.asyncExecutionThread.isAlive()) {
                        this.asyncExecutionThread.join();
                    }

                    this.asyncExecutionThread = null;
                }

                this.mSocket.close();
                this.mSocket = null;
            }
        } catch (IOException var4) {
            ;
        } catch (InterruptedException var5) {
            ;
        }

    }

    public String getAddress() {
        return this.macAddress;
    }

    public String getRemoteDeviceName() {
        return this.mAdapter.getRemoteDevice(this.macAddress).getName();
    }

    public ConnectionHandle getHandle() {
        boolean alreadyReturned = this.alreadyReturnedConnectionHandle.getAndSet(true);
        if(alreadyReturned) {
            String error_msg = "getHandle() multiple calls";
            Log.w("libmuse platform", error_msg);
            throw new RuntimeException(error_msg);
        } else {
            return new AndroidConnectionHandle(this);
        }
    }

    public boolean hasBytes() {
        boolean result = false;

        try {
            result = this.mSocket.getInputStream().available() > 0;
            return result;
        } catch (IOException var4) {
            String error_msg = "Muse hasBytes() failed";
            Log.w("libmuse platform", error_msg);
            throw new RuntimeException(error_msg);
        }
    }

    public byte[] getBytes() {
        ByteArrayOutputStream result = new ByteArrayOutputStream();

        try {
            int e = this.mSocket.getInputStream().read(this.buffer);
            result.write(this.buffer, 0, e);
        } catch (IOException var4) {
            String error_msg = "getBytes() from Muse failed";
            Log.w("libmuse platform", error_msg);
            throw new RuntimeException(error_msg);
        }

        return result.toByteArray();
    }

    public void writeBinaryBytes(byte[] data) {
        try {
            this.mSocket.getOutputStream().write(data);
        } catch (IOException var4) {
            String error_msg = "writeBytes() to Muse failed";
            Log.w("libmuse platform", error_msg);
            throw new RuntimeException(error_msg);
        }
    }
}
