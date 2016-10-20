package com.coolweather.app.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	
	
	public CoolWeatherOpenHelper(Context context, String name, CursorFactory 
			factory, int version){
		super(context, name, factory, version);
	}
	
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table Province(" +
				"id integer primary key autoincrement," +
				"province_name text, " +
				"province_code text" +
				");");
		db.execSQL("create teble City(" +
				"id integer primary key autoincrement," +
				"city_name text" +
				"city_code text" +
				"province_id integer" +
				");");
		db.execSQL("create table Country(" +
				"id integer primary key autoincrement," +
				"country_name text," +
				"country_code text," +
				"city_id integer" +
				");");
		
	}
	
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
	

}
