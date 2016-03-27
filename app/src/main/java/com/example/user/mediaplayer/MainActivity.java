
package com.example.user.mediaplayer;

import android.content.Intent;
import android.media.MediaPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.user.mediaplayer.backend.DbManager;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;
    int paused;
    protected DbManager data = new DbManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    display all music in playlist
     */
    public void show_music(View view) {
        Intent intent = new Intent(this, MusicList.class);
        startActivity(intent);
    }

    /*
    play song and make sure to not start multiple of same song
     */
    public void play_music(View view) {
        Integer nextSong = data.nextSong();
        if (song == null) {
            song = MediaPlayer.create(this, nextSong);
            song.start();
        } else if (!song.isPlaying()){
            song.seekTo(paused);
            song.start();
        } else {
            pause_music(view);
        }
    }

    /*
    pause the song and store the paused time
     */
    public void pause_music(View view) {
        if (song != null) {
            song.pause();
            paused = song.getCurrentPosition();
        }
    }

    /*
    restart the song from the beginning
     */
    public void rewind_music(View view) {
        if (song != null) {
            song.seekTo(0);
            //song.start();
        }
    }

    /*
    skip the current song to the next one
     */
    public void forward_music(View view) {

        Integer nextSong = data.nextSong();
        if (song != null) {
            song.seekTo(song.getDuration());
            MediaPlayer song2 = MediaPlayer.create(getApplicationContext(), nextSong);
            song.setNextMediaPlayer(song2);
            try {
                song2.prepare();
            } catch (Exception e) {
            }

            song = song2;
        }
    }

    /*
    when a music is liked add 7.5 points
     */
    public void like_music(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        song.release();
    }
}
