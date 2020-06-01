package com.atcb.firstproject.database;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {DatumDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DAO getDataDAO();
}
