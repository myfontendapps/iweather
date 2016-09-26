package com.tc.iweather.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.tc.iweather.db.IWeatherOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tancan on 2016/9/26.
 */
public class IWeatherDB {
    /**
     * DB name
     */
    public static final String DB_NAME = "i_weather";

    /**
     * DB version
     */
    public static final int VERSION = 1;

    private static IWeatherDB iWeatherDB;

    private SQLiteDatabase db;

    /**
     *  privatize construct method
     */
    private IWeatherDB(Context context) {
        IWeatherOpenHelper dbHelper = new IWeatherOpenHelper(context,
                DB_NAME, NULL, VERSION);
        db = dbHelper.getWritableDatabase();
    }

    /**
     * get instance of IWeatherDB
     */
    public synchronized static IWeatherDB getInstance(Context context) {
        if (iWeatherDB == null) {
            iWeatherDB = new IWeatherDB(context);
        }
        return iWeatherDB;
    }

    /**
     * save Province instance to DB
     */
    public void saveProvince(Province province) {
        if (province != null) {
            ContentValues values = new ContentValues();
            values.put("province_name", province.getProvinceName());
            valuse.put("province_code", province.getProvinceCode());
            db.insert("Province", null, values);
        }
    }

    /**
     *   get all province of all the country from DB
     */
    public List<Province> loadProvinces() {
        List<Province> list = new ArrayList<Province>();
        Cursor cursor = db.query("Province", null, null, null, null, null, null);

        if (cursor.moveToFirst()) {
            do {
                
            }
        }

    }




}
