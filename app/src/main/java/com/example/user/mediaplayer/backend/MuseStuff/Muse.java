//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.ConnectionState;
import com.example.user.mediaplayer.backend.MuseStuff.MuseConfiguration;
import com.example.user.mediaplayer.backend.MuseStuff.MuseConnectionListener;
import com.example.user.mediaplayer.backend.MuseStuff.MuseDataListener;
import com.example.user.mediaplayer.backend.MuseStuff.MuseDataPacketType;
import com.example.user.mediaplayer.backend.MuseStuff.MusePreset;
import com.example.user.mediaplayer.backend.MuseStuff.MuseVersion;
import com.example.user.mediaplayer.backend.MuseStuff.NotchFrequency;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Muse {
    public Muse() {
    }

    public abstract void connect();

    public abstract void disconnect(boolean var1);

    public abstract void execute();

    public abstract void runAsynchronously();

    public abstract ConnectionState getConnectionState();

    public abstract String getMacAddress();

    public abstract String getName();

    public abstract MuseConfiguration getMuseConfiguration();

    public abstract MuseVersion getMuseVersion();

    public abstract void registerConnectionListener(MuseConnectionListener var1);

    public abstract void unregisterConnectionListener(MuseConnectionListener var1);

    public abstract void registerDataListener(MuseDataListener var1, MuseDataPacketType var2);

    public abstract void unregisterDataListener(MuseDataListener var1, MuseDataPacketType var2);

    public abstract void unregisterAllListeners();

    public abstract void setPreset(MusePreset var1);

    public abstract void enableDataTransmission(boolean var1);

    public abstract void setNotchFrequency(NotchFrequency var1);

    private static final class CppProxy extends Muse {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef) {
            if(nativeRef == 0L) {
                throw new RuntimeException("nativeRef is zero");
            } else {
                this.nativeRef = nativeRef;
            }
        }

        private native void nativeDestroy(long var1);

        public void destroy() {
            boolean destroyed = this.destroyed.getAndSet(true);
            if(!destroyed) {
                this.nativeDestroy(this.nativeRef);
            }

        }

        protected void finalize() throws Throwable {
            this.destroy();
            super.finalize();
        }

        public void connect() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_connect(this.nativeRef);
        }

        private native void native_connect(long var1);

        public void disconnect(boolean unregisterListeners) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_disconnect(this.nativeRef, unregisterListeners);
        }

        private native void native_disconnect(long var1, boolean var3);

        public void execute() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_execute(this.nativeRef);
        }

        private native void native_execute(long var1);

        public void runAsynchronously() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_runAsynchronously(this.nativeRef);
        }

        private native void native_runAsynchronously(long var1);

        public ConnectionState getConnectionState() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getConnectionState(this.nativeRef);
        }

        private native ConnectionState native_getConnectionState(long var1);

        public String getMacAddress() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getMacAddress(this.nativeRef);
        }

        private native String native_getMacAddress(long var1);

        public String getName() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getName(this.nativeRef);
        }

        private native String native_getName(long var1);

        public MuseConfiguration getMuseConfiguration() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getMuseConfiguration(this.nativeRef);
        }

        private native MuseConfiguration native_getMuseConfiguration(long var1);

        public MuseVersion getMuseVersion() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getMuseVersion(this.nativeRef);
        }

        private native MuseVersion native_getMuseVersion(long var1);

        public void registerConnectionListener(MuseConnectionListener listener) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_registerConnectionListener(this.nativeRef, listener);
        }

        private native void native_registerConnectionListener(long var1, MuseConnectionListener var3);

        public void unregisterConnectionListener(MuseConnectionListener listener) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_unregisterConnectionListener(this.nativeRef, listener);
        }

        private native void native_unregisterConnectionListener(long var1, MuseConnectionListener var3);

        public void registerDataListener(MuseDataListener listener, MuseDataPacketType type) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_registerDataListener(this.nativeRef, listener, type);
        }

        private native void native_registerDataListener(long var1, MuseDataListener var3, MuseDataPacketType var4);

        public void unregisterDataListener(MuseDataListener listener, MuseDataPacketType type) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_unregisterDataListener(this.nativeRef, listener, type);
        }

        private native void native_unregisterDataListener(long var1, MuseDataListener var3, MuseDataPacketType var4);

        public void unregisterAllListeners() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_unregisterAllListeners(this.nativeRef);
        }

        private native void native_unregisterAllListeners(long var1);

        public void setPreset(MusePreset preset) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_setPreset(this.nativeRef, preset);
        }

        private native void native_setPreset(long var1, MusePreset var3);

        public void enableDataTransmission(boolean enable) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_enableDataTransmission(this.nativeRef, enable);
        }

        private native void native_enableDataTransmission(long var1, boolean var3);

        public void setNotchFrequency(NotchFrequency newFrequency) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_setNotchFrequency(this.nativeRef, newFrequency);
        }

        private native void native_setNotchFrequency(long var1, NotchFrequency var3);
    }
}
