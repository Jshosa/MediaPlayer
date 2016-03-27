package com.example.user.mediaplayer.backend;

//import android.app.Activity;
//import android.util.Log;


import android.app.Activity;

import com.example.user.mediaplayer.backend.MuseStuff.*;

import java.util.ArrayList;

public class DataListener extends MuseDataListener{

    private MuseFileWriter fileWriter;

    final Activity activityRef;

    public DataListener(Activity activityRef) {
        this.activityRef = activityRef;
    }


    // we are only keeping track of alpha and beta scores
    @Override
    public void receiveMuseDataPacket(MuseDataPacket p) {
        switch (p.getPacketType()) {
            case ALPHA_SCORE:
                updateAlphaScore(p.getValues());
                break;
            case BETA_SCORE:
                updateBetaScore(p.getValues());
                break;
            default:
                break;
        }
    }

    @Override
    public void receiveMuseArtifactPacket(MuseArtifactPacket p) {
        if (p.getHeadbandOn() && p.getBlink()) {
  //          Log.i("Artifacts", "blink");
        }
    }

    private void updateBetaScore(final ArrayList<Double> data) {
        int leftEar = Integer.parseInt(String.format("%6.2f", data.get(Eeg.TP9.ordinal())));
        int leftForehead = Integer.parseInt(String.format("%6.2f", data.get(Eeg.FP1.ordinal())));
        int rightForehead = Integer.parseInt(String.format("%6.2f", data.get(Eeg.FP2.ordinal())));
        int rightEar = Integer.parseInt(String.format("%6.2f", data.get(Eeg.TP10.ordinal())));

        int tots_score;
        tots_score = (leftEar + leftForehead + rightForehead + rightEar) / 4;

        System.out.println(tots_score);

        }

    private void updateAlphaScore(final ArrayList<Double> data) {
        int leftEar = Integer.parseInt(String.format("%6.2f", data.get(Eeg.TP9.ordinal())));
        int leftForehead = Integer.parseInt(String.format("%6.2f", data.get(Eeg.FP1.ordinal())));
        int rightForehead = Integer.parseInt(String.format("%6.2f", data.get(Eeg.FP2.ordinal())));
        int rightEar = Integer.parseInt(String.format("%6.2f", data.get(Eeg.TP10.ordinal())));

        int tots_score;
        tots_score = (leftEar + leftForehead + rightForehead + rightEar) / 4;

        System.out.println(tots_score);

    }



}




