//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Looper;
import android.util.Log;
import com.example.user.mediaplayer.backend.MuseStuff.Muse;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFactory;
import com.example.user.mediaplayer.backend.MuseStuff.MusePlatformAndroid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class MuseManager {
    private static final String TAG = "libmuse native";
    private static final HashMap<String, Muse> pairedMuses;
    private static final Object LOCK;
    private static boolean calledLooperAlready;

    private MuseManager() {
    }

    static Muse getMuse(String macAddress) {
        Object var1 = LOCK;
        synchronized(LOCK) {
            return pairedMuses.containsKey(macAddress)?(Muse)pairedMuses.get(macAddress):null;
        }
    }

    static BluetoothAdapter getDefaultBluetoothAdapter() {
        if(!calledLooperAlready) {
            try {
                Looper.prepare();
            } catch (RuntimeException var1) {
                ;
            }

            calledLooperAlready = true;
        }

        return BluetoothAdapter.getDefaultAdapter();
    }

    public static void refreshPairedMuses() {
        refreshPairedMuses("muse");
    }

    public static void refreshPairedMuses(String pattern) {
        BluetoothAdapter adapter = getDefaultBluetoothAdapter();
        if(adapter == null) {
            Log.e("libmuse native", "cannot access bluetooth adapter");
        } else {
            Object var2 = LOCK;
            synchronized(LOCK) {
                Set bonded = adapter.getBondedDevices();
                Iterator i$;
                if(!pairedMuses.isEmpty()) {
                    i$ = pairedMuses.keySet().iterator();

                    while(i$.hasNext()) {
                        String device = (String)i$.next();
                        BluetoothDevice address = adapter.getRemoteDevice(device);
                        if(!bonded.contains(address)) {
                            pairedMuses.remove(device);
                        }
                    }
                }

                i$ = bonded.iterator();

                while(i$.hasNext()) {
                    BluetoothDevice device1 = (BluetoothDevice)i$.next();
                    String address1 = device1.getAddress();
                    if(device1.getName().toLowerCase(Locale.US).startsWith(pattern) && !pairedMuses.containsKey(address1)) {
                        MusePlatformAndroid platform = new MusePlatformAndroid(address1);
                        Muse muse = MuseFactory.getMuse(platform);
                        platform.setMuse(new WeakReference(muse));
                        pairedMuses.put(address1, muse);
                    }
                }

            }
        }
    }

    public static List<Muse> getPairedMuses() {
        Object var0 = LOCK;
        synchronized(LOCK) {
            return new ArrayList(pairedMuses.values());
        }
    }

    static {
        System.loadLibrary("muse");
        pairedMuses = new HashMap();
        LOCK = new Object();
        calledLooperAlready = false;
    }
}
