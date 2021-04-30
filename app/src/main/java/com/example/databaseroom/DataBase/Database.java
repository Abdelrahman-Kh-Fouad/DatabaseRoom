package com.example.databaseroom.DataBase;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.databaseroom.Human;

import java.util.concurrent.SynchronousQueue;

@androidx.room.Database(entities = Human.class , version = 0)
public abstract class Database extends RoomDatabase {
    private static String dbName ="People DB";
    private static Database instance ;
    public static synchronized Database getInstance(Context context){

        if(instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    Database.class,dbName
            ).build();
        }
        return instance;
    }


}
