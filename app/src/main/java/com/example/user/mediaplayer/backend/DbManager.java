/**
 * Created by sakshaatchoyikandi on 16-03-26.
 */
package com.example.user.mediaplayer.backend;

    import android.content.Context;
    import android.os.Environment;

    import com.example.user.mediaplayer.R;

    import java.io.File;
    import java.util.ArrayList;


public class DbManager {
  private Database dbHelper;
  private ArrayList<Integer> songs = new ArrayList<>();



  public void populate_list() {
    this.songs.add(R.raw.ohyeah);
    this.songs.add(R.raw.maybach);
    this.songs.add(R.raw.lowlife);
  }

  public DbManager(Context context) {
    this.dbHelper = new Database(context);
    populate_list();
  }

  public void populate_data() {

    // Find all the /music
    File dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
    if(dir.listFiles() != null) {
       for(File file : dir.listFiles()) {
          //dbHelper.add_songs(file);
    }

    }

  }

  public int nextSong() {
    return this.songs.remove(0);
  }

  public void liked_song(String path) {
    // find the query and add 7.5 to its rank.
  }

  public void skipped_song(String path) {
    // find the songs query and deduct 2 from its rank.
  }

  public void muse_data(String path, long factor) {
    // find the songs quesry and add the factor to its rank
  }

  public void sort() {
    // sort the database by rank.
  }

}