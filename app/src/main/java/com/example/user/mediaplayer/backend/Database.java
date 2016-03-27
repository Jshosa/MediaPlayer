package com.example.user.mediaplayer.backend;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sakshaatchoyikandi on 16-03-26.
 */
public class Database extends SQLiteOpenHelper {

  // TODO: Change version number when Add/Edit table
  private static final int DATABASE_VERSION = 1;
  private static final String DATABASE_NAME = "data.db";

  public Database(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
        /*
         * Sample Statement:
         *
         * CREATE TABLE Users (
         *  id INTEGER PRIMARY KEY AUTOINCREMENT,
         *  username TEXT NOT NULL,
         *  password TEXT NOT NULL);
         */

    populate(this);

    String CREATE_TABLE_USERS = "CREATE TABLE "
        + "Songs" + "("
        + "id" + "INTEGER PRIMARY KEY NOT NULL, "
        + "Path" + " TEXT UNIQUE NOT NULL, "
        + "Rank" + " INTEGER)";

    db.execSQL(CREATE_TABLE_USERS);
  }

  protected void populate(Database data) {

  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // Drop the older table and create a new one
    db.execSQL("DROP TABLE IF EXISTS " + "Songs");
    onCreate(db);

  }
}
