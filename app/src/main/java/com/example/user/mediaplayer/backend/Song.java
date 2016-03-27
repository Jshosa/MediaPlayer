package com.example.user.mediaplayer.backend;

import android.media.MediaPlayer;

/**
 * Created by sakshaatchoyikandi on 16-03-26.
 */
public class Song extends MediaPlayer {
  public String path;
  public long rank;

  public Song(String path, long rank ) {
    super();
    this.path = path;
    this.rank = rank;
  }

  public long getRank() {
    return rank;
  }

  public void setRank(long rank) {
    this.rank = rank;
  }

}
