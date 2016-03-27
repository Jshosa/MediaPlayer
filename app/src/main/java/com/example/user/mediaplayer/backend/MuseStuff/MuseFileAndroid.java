//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import android.util.Log;
import com.example.user.mediaplayer.backend.MuseStuff.MuseFile;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class MuseFileAndroid extends MuseFile {
    private static final String TAG = "libmuse file";
    private File file;
    private OutputStream outStream;
    private InputStream inStream;
    private boolean reading;
    private boolean writing;

    MuseFileAndroid(File file) {
        this.file = file;
        this.reading = false;
        this.writing = false;
    }

    public void open(boolean forWriting) {
        try {
            if(forWriting) {
                if(this.writing) {
                    return;
                }

                this.outStream = new BufferedOutputStream(new FileOutputStream(this.file, true));
                this.writing = true;
            } else {
                if(this.reading) {
                    return;
                }

                this.inStream = new BufferedInputStream(new FileInputStream(this.file));
                this.reading = true;
            }
        } catch (FileNotFoundException var3) {
            Log.e("libmuse file", "open() failed", var3);
        }

    }

    public void write(byte[] buffer) {
        if(!this.writing) {
            Log.e("libmuse file", "file was not opened for writing");
        } else {
            try {
                this.outStream.write(buffer);
            } catch (IOException var3) {
                Log.e("libmuse file", "write() failed", var3);
            }

        }
    }

    public byte[] read(int length) {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        if(this.reading) {
            try {
                if(length <= this.inStream.available()) {
                    byte[] e = new byte[length];
                    int byte_num = this.inStream.read(e, 0, length);
                    if(byte_num == length) {
                        result.write(e, 0, byte_num);
                    }
                }
            } catch (IOException var5) {
                Log.e("libmuse file", "read() failed", var5);
            }
        } else {
            Log.e("libmuse file", "file was not opened for reading");
        }

        return result.toByteArray();
    }

    public void close(boolean forWriting) {
        try {
            if(forWriting && this.writing) {
                this.outStream.close();
                this.writing = false;
            } else if(!forWriting && this.reading) {
                this.inStream.close();
                this.reading = false;
            }
        } catch (IOException var3) {
            Log.e("libmuse file", "close() failed", var3);
        }

    }
}
