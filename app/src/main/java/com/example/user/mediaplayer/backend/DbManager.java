/**
 * Created by sakshaatchoyikandi on 16-03-26.
 */
package com.example.user.mediaplayer.backend;

    import android.content.Context;
    import android.os.Environment;
    import android.util.Log;
    import java.io.File;



public class DbManager {
  private Database dbHelper;


  public DbManager(Context context) {
    this.dbHelper = new Database(context);
  }


  public void create() {

    File dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
    Log.e("hheythere", dir.getPath());
    if(dir.listFiles() != null) {
    for(File file : dir.listFiles()) {
      Log.e("hheythere", file.getPath());
    }


    }


  }

}