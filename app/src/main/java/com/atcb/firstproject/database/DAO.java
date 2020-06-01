package com.atcb.firstproject.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.atcb.firstproject.model.Datum;

import java.util.List;

@Dao
public interface DAO {
    @Insert
    public void insertALl(List<DatumDatabase> datumList);

    @Query("Select * from Data")
    public List<Datum> getData();
}
