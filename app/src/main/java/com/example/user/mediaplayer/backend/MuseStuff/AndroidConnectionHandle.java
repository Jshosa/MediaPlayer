//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.ConnectionHandle;
import com.example.user.mediaplayer.backend.MuseStuff.MusePlatformAndroid;

final class AndroidConnectionHandle extends ConnectionHandle {
    private MusePlatformAndroid platform;

    AndroidConnectionHandle(MusePlatformAndroid platform) {
        this.platform = platform;
    }

    public boolean hasBytes() {
        return this.platform.hasBytes();
    }

    public byte[] getBytes() {
        return this.platform.getBytes();
    }

    public void writeBytes(String data) {
        this.platform.writeBinaryBytes(data.getBytes());
    }

    public void writeBinaryBytes(byte[] data) {
        this.platform.writeBinaryBytes(data);
    }
}
