package com.example.saiprashanth.mainproject;

import android.provider.BaseColumns;

/**
 * Created by saiprashanth on 10/21/2015.
 */
public class TableData {
    public TableData()
    {

    }
 public static abstract class TableInfo implements BaseColumns
 {
    public static final String USER_NAME="user_name";
    public static final String PASSWORD="password";
    public static final String DATABASE_NAME="database";
    public static final String TABLE_NAME="signup";
 }


}
