package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "weather", indices = {@Index(value = {"date"}, unique = true)})
//Without this, the table name would have been "weatherentry".
public class WeatherEntry {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int weatherIconId;
    private Date date;
    private double min;
    private double max;
    private double humidity;
    private double pressure;
    private double wind;
    private double degrees;

    /**
     * This constructor is used by OpenWeatherJsonParser. When the network fetch has JSON data, it
     * converts this data to WeatherEntry objects using this constructor.
     * @param weatherIconId Image id for weather
     * @param date Date of weather
     * @param min Min temperature
     * @param max Max temperature
     * @param humidity Humidity for the day
     * @param pressure Barometric pressure
     * @param wind Wind speed
     * @param degrees Wind direction
     */

    @Ignore
    public WeatherEntry(int weatherIconId, Date date, double min, double max, double humidity, double pressure, double wind, double degrees) {
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.degrees = degrees;
    }

    public WeatherEntry(int id, int weatherIconId, Date date, double min, double max, double humidity, double pressure, double wind, double degrees) {
        this.id = id;
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.degrees = degrees;
    }

    //This means you should have two constructors: the original constructor
    // which doesn't include the id field and the new constructor.
    // The original constructor is used by the OpenWeatherJsonParser code
    // when it converts the JSON from the mock weather server to WeatherEntry objects.
    // The additional constructor you just created is used by Room.

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWind() {
        return wind;
    }

    public double getDegrees() {
        return degrees;
    }
}
