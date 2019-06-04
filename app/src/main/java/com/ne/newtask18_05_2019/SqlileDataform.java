package com.ne.newtask18_05_2019;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SqlileDataform extends SQLiteOpenHelper {

     SQLiteDatabase sglitedata;


    public SqlileDataform( Context context) {
        super(context, "datalc.db", null, 1);
        sglitedata=getWritableDatabase();
    }

    public void getInput( String a_username,String m, String b_location, String c_mobilenumber,String d_password)
    {
            ContentValues contentValues= new ContentValues();
        contentValues.put("username" ,a_username);
        contentValues.put("mailid" ,m);

        contentValues.put("mobilenumber",c_mobilenumber);  contentValues.put("location",b_location);
        contentValues.put("password",d_password);
     long k=   sglitedata.insert("fir",null,contentValues );
        Log.d("oiuyt",k+"");
    }
public String setInput(String a_username)
{
    Cursor mycursor;
    mycursor=sglitedata.query("fir",null,"username=?", new String[]{a_username},null,null,null);
    mycursor.moveToFirst();
    if (mycursor.getCount() < 1)
        return"not exist";
    return mycursor.getString(mycursor.getColumnIndex("location"));
    }

    public void mainInput (String username,String mobilenumber){
        ContentValues contvalue= new ContentValues();
        contvalue.put("username", username);
        contvalue.put("mobilenumber", mobilenumber);
        sglitedata.insert("fir",null,contvalue);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table fir(username text,mailid text,mobilenumber text,location text,password text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
