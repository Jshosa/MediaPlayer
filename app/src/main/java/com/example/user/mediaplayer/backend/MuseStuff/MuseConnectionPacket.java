//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.ConnectionState;
import com.example.user.mediaplayer.backend.MuseStuff.SenderInformation;

public final class MuseConnectionPacket {
    final SenderInformation source;
    final ConnectionState previousConnectionState;
    final ConnectionState currentConnectionState;

    public MuseConnectionPacket(SenderInformation source, ConnectionState previousConnectionState, ConnectionState currentConnectionState) {
        this.source = source;
        this.previousConnectionState = previousConnectionState;
        this.currentConnectionState = currentConnectionState;
    }

    public SenderInformation getSource() {
        return this.source;
    }

    public ConnectionState getPreviousConnectionState() {
        return this.previousConnectionState;
    }

    public ConnectionState getCurrentConnectionState() {
        return this.currentConnectionState;
    }
}
