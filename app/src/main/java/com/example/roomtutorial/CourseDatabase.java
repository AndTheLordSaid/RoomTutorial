package com.example.roomtutorial;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {CourseModal.class},version = 1)
public abstract class CourseDatabase extends RoomDatabase {

    //create instance
    //for our database class

    private static CourseDatabase instance;

    //below is abstract for dao
    public abstract Dao dao();

    //below line get instance for out database

    public static synchronized CourseDatabase getInstance(Context context){
        //below line to
        if (instance==null){
            //if the instance is null
            // create a new instance

            instance =
                    Room.databaseBuilder(context.getApplicationContext(),CourseDatabase.class,
                            .fallbackToDestructiveMigration()
                            //provide callback to database
                            .addCallback(roomCallback)
                            //build database
                            .build();

        }
        //after creating our instance we are returning the instance
        return instance;

    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            // this method is called when database is created
            // and below line is to populate our data.
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void,Void,Void>{

    }

}

