//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

public abstract class MuseFile {
    public MuseFile() {
    }

    public abstract void open(boolean var1);

    public abstract void write(byte[] var1);

    public abstract byte[] read(int var1);

    public abstract void close(boolean var1);
}
