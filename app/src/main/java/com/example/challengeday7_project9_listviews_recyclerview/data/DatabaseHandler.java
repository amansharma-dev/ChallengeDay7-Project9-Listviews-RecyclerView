package com.example.challengeday7_project9_listviews_recyclerview.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.challengeday7_project9_listviews_recyclerview.R;
import com.example.challengeday7_project9_listviews_recyclerview.model.Contact;
import com.example.challengeday7_project9_listviews_recyclerview.util.Utils;

public class DatabaseHandler extends SQLiteOpenHelper {

    public DatabaseHandler(Context context) {
        super(context, Utils.DATABASE_NAME, null, Utils.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //create table

        String CREATE_CONTACT_TABLE = "CREATE TABLE "+ Utils.DATABASE_TABLE_NAME + "("
                +Utils.KEY_USER_ID + " INTEGER PRIMARY KEY,"
                +Utils.KEY_USER_NAME + " TEXT,"
                +Utils.KEY_USER_CONTACT_NUMBER + " TEXT"+")";

        sqLiteDatabase.execSQL(CREATE_CONTACT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String DROP_TABLE = String.valueOf(R.string.drop_table);
        sqLiteDatabase.execSQL(DROP_TABLE,new String[]{Utils.DATABASE_NAME});

        //recreate table
        onCreate(sqLiteDatabase);
    }

    // Now, CRUD - CREATE, READ, UPDATE, DELETE

    //1. CREATE--ADD

    public void addContact(Contact contact){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //content values to add data, contacts;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utils.KEY_USER_NAME,contact.getUserName());
        contentValues.put(Utils.KEY_USER_CONTACT_NUMBER,contact.getUserContactNumber());

        //insert to row

        sqLiteDatabase.insert(Utils.DATABASE_TABLE_NAME,null,contentValues);

        //close db
        sqLiteDatabase.close();
    }


}


