//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.MuseArtifactPacket;
import com.example.user.mediaplayer.backend.MuseStuff.MuseDataPacket;

public abstract class MuseDataListener {
    public MuseDataListener() {
    }

    public abstract void receiveMuseDataPacket(MuseDataPacket var1);

    public abstract void receiveMuseArtifactPacket(MuseArtifactPacket var1);
}
