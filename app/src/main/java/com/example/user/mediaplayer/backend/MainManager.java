package com.example.user.mediaplayer.backend;

import android.app.Activity;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.example.user.mediaplayer.backend.MuseStuff.*;

import com.example.user.mediaplayer.backend.*;

import java.util.ArrayList;
import java.util.List;

public class MainManager {

    private Muse muse;
    private ConnectionListener connectionListener;
    private DataListener dataListener;
    private boolean dataTransmission;
    private MuseFileWriter fileWriter;

    public MainManager(Activity activity) {
        this.connectionListener = new ConnectionListener(activity);
        this.dataListener = new DataListener(activity);

    }

    public void refresh() {
        MuseManager.refreshPairedMuses();
        List<Muse> pairedMuses = MuseManager.getPairedMuses();
        List<String> spinnerItems = new ArrayList<String>();
        for (Muse m: pairedMuses) {
            String dev_id = m.getName() + "-" + m.getMacAddress();
            //Log.i("Muse Headband", dev_id);
            spinnerItems.add(dev_id);
        }
    }

    public void connect() {
        List<Muse> pairedMuses = MuseManager.getPairedMuses();
        if (pairedMuses.size() < 1) {
            Log.w("Muse Headband", "There is nothing to connect to");
        }
        else {
            muse = pairedMuses.get(0);
            ConnectionState state = muse.getConnectionState();
            if (state == ConnectionState.CONNECTED ||
                    state == ConnectionState.CONNECTING) {
                Log.w("Muse Headband",
                        "doesn't make sense to connect second time to the same muse");
                return;
            }
            configureLibrary();
       //     fileWriter.open();
         //   fileWriter.addAnnotationString(1, "Connect clicked");
            /**
             * In most cases libmuse native library takes care about
             * exceptions and recovery mechanism, but native code still
             * may throw in some unexpected situations (like bad bluetooth
             * connection). Print all exceptions here.
             */
            try {
                muse.runAsynchronously();
            } catch (Exception e) {
                Log.e("Muse Headband", e.toString());
            }
        }
    }

    public void disconnect() {
        if (muse != null) {
            /**
             * true flag will force libmuse to unregister all listeners,
             * BUT AFTER disconnecting and sending disconnection event.
             * If you don't want to receive disconnection event (for ex.
             * you call disconnect when application is closed), then
             * unregister listeners first and then call disconnect:
             * muse.unregisterAllListeners();
             * muse.disconnect(false);
             */
            muse.disconnect(true);
        }
    }

    private void configureLibrary() {
        muse.registerConnectionListener(connectionListener);
        muse.registerDataListener(dataListener, MuseDataPacketType.BETA_SCORE);
        muse.registerDataListener(dataListener, MuseDataPacketType.ALPHA_SCORE);

        muse.setPreset(MusePreset.PRESET_14);
        muse.enableDataTransmission(dataTransmission);
    }
}
