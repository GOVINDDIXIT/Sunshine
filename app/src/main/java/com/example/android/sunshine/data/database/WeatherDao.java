package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.Date;

@Dao
public interface WeatherDao {
/**bulkInsert method inserts any number of WeatherEntry objects.
   As the app receives lists of weather entries from the server,
   it'll use bulkInsert to put them into the database.
   when new data is fetched old data will be replaced
 */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void bulkInsert(WeatherEntry... weather);

    /**
     * Gets the weather for a single day
     *
     * @param date The date you want weather for
     * @return Weather for a single day
     */

    @Query("SELECT * FROM weather WHERE date =  :date")
    WeatherEntry getWeatherByDate(Date date);
}
