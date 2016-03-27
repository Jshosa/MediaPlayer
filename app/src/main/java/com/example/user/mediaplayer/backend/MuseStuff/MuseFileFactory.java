//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.MuseFile;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFileAndroid;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFileReader;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFileWriter;
import java.io.File;

public final class MuseFileFactory {
    private MuseFileFactory() {
    }

    public static MuseFileWriter getMuseFileWriter(File file) {
        MuseFileAndroid museFile = new MuseFileAndroid(file);
        return MuseFileWriter.getFileWriter(museFile);
    }

    public static MuseFileReader getMuseFileReader(File file) {
        MuseFileAndroid museFile = new MuseFileAndroid(file);
        return MuseFileReader.getFileReader(museFile);
    }

    public static MuseFile getMuseFile(File file) {
        return new MuseFileAndroid(file);
    }

    static {
        System.loadLibrary("muse");
    }
}
