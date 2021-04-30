package com.example.databaseroom.DataBase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.databaseroom.Human;

import java.util.ArrayList;

@Dao

public interface DaoHuman {

    @Insert
    void insert(Human human);

    @Update
    void update(Human human);

    @Delete
    void delete(Human human);

    @Query("SELECT * FROM Humans")
    ArrayList<Human> getAllHumans();
}