package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

@Database(entities = {WeatherEntry.class}, version = 1)
@TypeConverters(DateConverter.class)
public abstract class SunshineDatabase extends RoomDatabase {

    public abstract WeatherDao weatherDao();

}
