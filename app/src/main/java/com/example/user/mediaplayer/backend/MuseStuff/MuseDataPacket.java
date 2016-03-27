//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.MuseDataPacketType;
import com.example.user.mediaplayer.backend.MuseStuff.SenderInformation;
import java.util.ArrayList;

public final class MuseDataPacket {
    final MuseDataPacketType packetType;
    final long timestamp;
    final SenderInformation source;
    final ArrayList<Double> values;

    public MuseDataPacket(MuseDataPacketType packetType, long timestamp, SenderInformation source, ArrayList<Double> values) {
        this.packetType = packetType;
        this.timestamp = timestamp;
        this.source = source;
        this.values = values;
    }

    public MuseDataPacketType getPacketType() {
        return this.packetType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public SenderInformation getSource() {
        return this.source;
    }

    public ArrayList<Double> getValues() {
        return this.values;
    }
}
