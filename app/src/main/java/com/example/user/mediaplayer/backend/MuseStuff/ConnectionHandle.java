//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

abstract class ConnectionHandle {
    ConnectionHandle() {
    }

    public abstract boolean hasBytes();

    public abstract byte[] getBytes();

    public abstract void writeBytes(String var1);

    public abstract void writeBinaryBytes(byte[] var1);
}
