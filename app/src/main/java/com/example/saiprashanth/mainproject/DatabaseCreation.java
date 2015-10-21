package com.example.saiprashanth.mainproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.saiprashanth.mainproject.TableData.TableInfo;

/**
 * Created by saiprashanth on 10/21/2015.
 */
public class DatabaseCreation extends SQLiteOpenHelper{
    public static final int database_version=1;
    public String CREATE_QUERY="CREATE TABLE"+TableInfo.TABLE_NAME+"("+
    TableInfo.USER_NAME+ " TEXT ,"+TableInfo.PASSWORD+" TEXT );";
    public DatabaseCreation(Context context)
    {
       super(context,TableInfo.DATABASE_NAME,null,1);
        Log.d("DatabaseOperations","Database created");

    }
@Override
    public void onCreate(SQLiteDatabase sdb)
    {
    sdb.execSQL(CREATE_QUERY);
        Log.d("DatabaseOperations", "Table created");
    }
@Override
    public void onUpgrade(SQLiteDatabase arg0,int arg1,int arg2)
{

}
    public void putInformation(DatabaseCreation dc,String name,String password)
    {
    SQLiteDatabase SQ=dc.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(TableInfo.USER_NAME,name);
        cv.put(TableInfo.PASSWORD, password);
        long k=SQ.insert(TableInfo.TABLE_NAME,null,cv);
        Log.d("Database Operations","One row inserted");
    }
}

