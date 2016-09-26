package com.tc.iweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tancan on 2016/9/26.
 */
public class IWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * create Province table statement
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text)";

    /**
     *  create City table statement
     */
    public static final String CREATE_CITY = "create table City ("
            + "id integer primary key autoincrement, "
            + "city_name text, "
            + "city_code text, "
            + "province_id integer)";

    /**
     *  create County table statement
     */
    public static final String CREATE_COUNTY = "create table County ("
            + "id integer primary key autoincrement, "
            + "county_name text, "
            + "county_code text, "
            + "city_id integer)";

    public IWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);//create Province table
        db.execSQL(CREATE_CITY);//create City table
        db.execSQL(CREATE_COUNTY);//create County table
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
