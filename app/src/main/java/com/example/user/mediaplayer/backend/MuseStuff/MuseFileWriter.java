//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.AnnotationData;
import com.example.user.mediaplayer.backend.MuseStuff.ComputingDeviceConfiguration;
import com.example.user.mediaplayer.backend.MuseStuff.DspData;
import com.example.user.mediaplayer.backend.MuseStuff.MuseConfiguration;
import com.example.user.mediaplayer.backend.MuseStuff.MuseDataPacket;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFile;
import com.example.user.mediaplayer.backend.MuseStuff.MuseVersion;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MuseFileWriter {
    public MuseFileWriter() {
    }

    public abstract void open();

    public abstract void close();

    public abstract void discardBufferedPackets();

    public abstract void flush();

    public abstract int getBufferredMessagesCount();

    public abstract int getBufferedMessagesSize();

    public abstract void addDataPacket(int var1, MuseDataPacket var2);

    public abstract void addAnnotationString(int var1, String var2);

    public abstract void addAnnotation(int var1, AnnotationData var2);

    public abstract void addConfiguration(int var1, MuseConfiguration var2);

    public abstract void addVersion(int var1, MuseVersion var2);

    public abstract void addComputingDeviceConfiguration(int var1, ComputingDeviceConfiguration var2);

    public abstract void addDsp(int var1, DspData var2);

    public static native MuseFileWriter getFileWriter(MuseFile var0);

    private static final class CppProxy extends MuseFileWriter {
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

        public void discardBufferedPackets() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_discardBufferedPackets(this.nativeRef);
        }

        private native void native_discardBufferedPackets(long var1);

        public void flush() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_flush(this.nativeRef);
        }

        private native void native_flush(long var1);

        public int getBufferredMessagesCount() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getBufferredMessagesCount(this.nativeRef);
        }

        private native int native_getBufferredMessagesCount(long var1);

        public int getBufferedMessagesSize() {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            return this.native_getBufferedMessagesSize(this.nativeRef);
        }

        private native int native_getBufferedMessagesSize(long var1);

        public void addDataPacket(int id, MuseDataPacket packet) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addDataPacket(this.nativeRef, id, packet);
        }

        private native void native_addDataPacket(long var1, int var3, MuseDataPacket var4);

        public void addAnnotationString(int id, String annotation) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addAnnotationString(this.nativeRef, id, annotation);
        }

        private native void native_addAnnotationString(long var1, int var3, String var4);

        public void addAnnotation(int id, AnnotationData annotation) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addAnnotation(this.nativeRef, id, annotation);
        }

        private native void native_addAnnotation(long var1, int var3, AnnotationData var4);

        public void addConfiguration(int id, MuseConfiguration configuration) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addConfiguration(this.nativeRef, id, configuration);
        }

        private native void native_addConfiguration(long var1, int var3, MuseConfiguration var4);

        public void addVersion(int id, MuseVersion version) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addVersion(this.nativeRef, id, version);
        }

        private native void native_addVersion(long var1, int var3, MuseVersion var4);

        public void addComputingDeviceConfiguration(int id, ComputingDeviceConfiguration configuration) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addComputingDeviceConfiguration(this.nativeRef, id, configuration);
        }

        private native void native_addComputingDeviceConfiguration(long var1, int var3, ComputingDeviceConfiguration var4);

        public void addDsp(int id, DspData dsp) {
            assert !this.destroyed.get() : "trying to use a destroyed object";

            this.native_addDsp(this.nativeRef, id, dsp);
        }

        private native void native_addDsp(long var1, int var3, DspData var4);
    }
}
