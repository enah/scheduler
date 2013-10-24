package com.example.myfirstapp;

import com.example.myfirstapp.Contract.Event;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EventDbHelper extends SQLiteOpenHelper {
	// increment every time database schema are changed
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "Events.db";
	
	public static final String TEXT = " TEXT";
	public static final String DATETIME = " DATETIME";
	public static final String NOT_NULL = " NOT NULL";
	public static final String COMMA = ",";
	public static final String SQL_CREATE_ENTRIES = 
		"CREATE TABLE " + Event.TABLE_NAME + " (" +
		Event._ID + " INTEGER PRIMARY KEY UNIQUE" + COMMA +
		Event.COLUMN_NAME_NAME + TEXT + " DEFAULT 'event'" + COMMA +
		Event.COLUMN_NAME_DATETIME + DATETIME + NOT_NULL + COMMA +
		Event.COLUMN_NAME_NOTES + TEXT + " )";
	
	public EventDbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
