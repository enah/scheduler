package com.example.myfirstapp;

import android.provider.BaseColumns;

public class Contract {
	// To prevent someone from instantiating the Contract class, empty constructor.
	public Contract() {}
	
	/** inner class describes table contents **/
	public static abstract class Event implements BaseColumns {
		public static final String TABLE_NAME = "event";
		public static final String COLUMN_NAME_NAME = "name";
		public static final String COLUMN_NAME_DATETIME = "time";
		public static final String COLUMN_NAME_NOTES = "notes";
	}
}
