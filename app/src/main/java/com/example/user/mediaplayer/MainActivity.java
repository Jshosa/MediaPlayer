
package com.example.user.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_music(View view) {

        Intent intent = new Intent(this, MusicList.class);
        startActivity(intent);
    }

    public void play_music(View view) {
    }

    public void pause_music(View view) {
    }

    public void rewind_music(View view) {
    }

    public void forward_music(View view) {
    }

    public void like_music(View view) {
    }
}
