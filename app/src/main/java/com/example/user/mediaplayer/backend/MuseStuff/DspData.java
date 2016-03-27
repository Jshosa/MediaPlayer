//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import java.util.ArrayList;

public final class DspData {
    final String type;
    final ArrayList<Double> floatArray;
    final ArrayList<Long> intArray;
    final String version;

    public DspData(String type, ArrayList<Double> floatArray, ArrayList<Long> intArray, String version) {
        this.type = type;
        this.floatArray = floatArray;
        this.intArray = intArray;
        this.version = version;
    }

    public String getType() {
        return this.type;
    }

    public ArrayList<Double> getFloatArray() {
        return this.floatArray;
    }

    public ArrayList<Long> getIntArray() {
        return this.intArray;
    }

    public String getVersion() {
        return this.version;
    }
}
