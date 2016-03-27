//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.AnnotationData;
import com.example.user.mediaplayer.backend.MuseStuff.ComputingDeviceConfiguration;
import com.example.user.mediaplayer.backend.MuseStuff.DspData;
import com.example.user.mediaplayer.backend.MuseStuff.MessageType;
import com.example.user.mediaplayer.backend.MuseStuff.MuseConfiguration;
import com.example.user.mediaplayer.backend.MuseStuff.MuseDataPacket;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFile;
import com.example.user.mediaplayer.backend.MuseStuff.MuseVersion;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MuseFileReader {
    public MuseFileReader() {
    }

    public abstract void open();

    public abstract void close();

    public abstract boolean gotoNextMessage();

    public abstract MessageType getMessageType();

    public abstract int getMessageId();

    public abstract long getMessageTimestamp();

    public abstract AnnotationData getAnnotation();

    public abstract MuseConfiguration getConfiguration();

    public abstract MuseVersion getVersion();

    public abstract ComputingDeviceConfiguration getComputingDeviceConfiguration();

    public abstract DspData getDsp();

    public abstract MuseDataPacket getDataPacket();

    public static native MuseFileReader getFileReader(MuseFile var0);

    private static final class CppProxy extends MuseFileReader {
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

        public void open() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_open(this.nativeRef);
        }

        private native void native_open(long var1);

        public void close() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_close(this.nativeRef);
        }

        private native void native_close(long var1);

        public boolean gotoNextMessage() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_gotoNextMessage(this.nativeRef);
        }

        private native boolean native_gotoNextMessage(long var1);

        public MessageType getMessageType() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getMessageType(this.nativeRef);
        }

        private native MessageType native_getMessageType(long var1);

        public int getMessageId() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getMessageId(this.nativeRef);
        }

        private native int native_getMessageId(long var1);

        public long getMessageTimestamp() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getMessageTimestamp(this.nativeRef);
        }

        private native long native_getMessageTimestamp(long var1);

        public AnnotationData getAnnotation() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getAnnotation(this.nativeRef);
        }

        private native AnnotationData native_getAnnotation(long var1);

        public MuseConfiguration getConfiguration() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getConfiguration(this.nativeRef);
        }

        private native MuseConfiguration native_getConfiguration(long var1);

        public MuseVersion getVersion() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getVersion(this.nativeRef);
        }

        private native MuseVersion native_getVersion(long var1);

        public ComputingDeviceConfiguration getComputingDeviceConfiguration() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getComputingDeviceConfiguration(this.nativeRef);
        }

        private native ComputingDeviceConfiguration native_getComputingDeviceConfiguration(long var1);

        public DspData getDsp() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getDsp(this.nativeRef);
        }

        private native DspData native_getDsp(long var1);

        public MuseDataPacket getDataPacket() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getDataPacket(this.nativeRef);
        }

        private native MuseDataPacket native_getDataPacket(long var1);
    }
}
