//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.ConnectionHandle;

abstract class MusePlatformInterface {
    MusePlatformInterface() {
    }

    public abstract void runAsynchronously();

    public abstract String getRemoteDeviceName();

    public abstract String getAddress();

    public abstract boolean connect();

    public abstract void disconnect();

    public abstract ConnectionHandle getHandle();
}
