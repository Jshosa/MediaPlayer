//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.SenderInformation;

public final class MuseArtifactPacket {
    final SenderInformation source;
    final boolean headbandOn;
    final boolean blink;
    final boolean jawClench;

    public MuseArtifactPacket(SenderInformation source, boolean headbandOn, boolean blink, boolean jawClench) {
        this.source = source;
        this.headbandOn = headbandOn;
        this.blink = blink;
        this.jawClench = jawClench;
    }

    public SenderInformation getSource() {
        return this.source;
    }

    public boolean getHeadbandOn() {
        return this.headbandOn;
    }

    public boolean getBlink() {
        return this.blink;
    }

    public boolean getJawClench() {
        return this.jawClench;
    }
}
