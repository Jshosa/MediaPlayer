package com.example.user.mediaplayer.backend;


import android.app.Activity;
import android.util.Log;

import com.example.user.mediaplayer.backend.MuseStuff.*;

import java.net.ConnectException;

public class ConnectionListener extends MuseConnectionListener {

    final Activity activityRef;

    public ConnectionListener(Activity activityRef) {
        this.activityRef = activityRef;
    }

    @Override
    public void receiveMuseConnectionPacket(MuseConnectionPacket p) {
        final ConnectionState current = p.getCurrentConnectionState();
        final String status = p.getPreviousConnectionState().toString() +
                " -> " + current;
        final String full = "Muse " + p.getSource().getMacAddress() +
                " " + status;
        Log.i("Muse Headband", full);

        //Activity activity = activityRef.get();
        // UI thread is used here only because we need to update
        // TextView values. You don't have to use another thread, unless
        // you want to run disconnect() or connect() from connection packet
        // handler. In this case creating another thread is required.
//        if (activity != null) {
//            activity.runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    TextView statusText =
//                            (TextView) findViewById(R.id.con_status);
//                    statusText.setText(status);
//                    TextView museVersionText =
//                            (TextView) findViewById(R.id.version);
//                    if (current == ConnectionState.CONNECTED) {
//                        MuseVersion museVersion = muse.getMuseVersion();
//                        String version = museVersion.getFirmwareType() +
//                                " - " + museVersion.getFirmwareVersion() +
//                                " - " + Integer.toString(
//                                museVersion.getProtocolVersion());
//                        museVersionText.setText(version);
//                    } else {
//                        museVersionText.setText(R.string.undefined);
//                    }
//                }
//            });
    }
}
