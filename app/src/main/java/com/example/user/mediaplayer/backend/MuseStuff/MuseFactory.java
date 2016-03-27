//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.Muse;
import com.example.user.mediaplayer.backend.MuseStuff.MusePlatformInterface;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class MuseFactory {
    MuseFactory() {
    }

    public static native Muse getMuse(MusePlatformInterface var0);

    private static final class CppProxy extends MuseFactory {
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
    }
}
