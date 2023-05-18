package com.example.ecommerceapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseConn extends SQLiteOpenHelper {

    private static String DatabaseName = "thatManPru";
    private static String DatabaseTable = "tableOfUsers";
    private static int DatabaseVersion = 1;

    private static String ID = "id";
    private static String fullname = "fullname";
    private static String emailAddress = "emailAddress";
    private static String passcode = "passcode";
    private static String DateOfBirth = "DateOfBirth";
    private static String PhoneNumber = "PhoneNumber";



    public DatabaseConn(@Nullable Context context) {
        super(context, DatabaseName, null, DatabaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table " + DatabaseTable + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+ fullname + " TEXT, "+ emailAddress +" TEXT, " + passcode + " TEXT, " + DateOfBirth + " TEXT, " + PhoneNumber + " TEXT)";

        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DatabaseTable);
        onCreate(sqLiteDatabase);
    }

    public void addingAnyUser(Users user){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(fullname, user.getFullname());
        values.put(emailAddress, user.getEmailAddress());
        values.put(passcode, user.getPasscode());
        values.put(PhoneNumber, user.getPhoneNumber());
        values.put(DateOfBirth, user.getDateOfBirth());
        database.insert(DatabaseTable, null, values);
    }

}
