package com.example.challengeday7_project9_listviews_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.challengeday7_project9_listviews_recyclerview.data.DatabaseHandler;
import com.example.challengeday7_project9_listviews_recyclerview.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(MainActivity.this);

        //add contacts
        databaseHandler.addContact(new Contact("James","001"));
        databaseHandler.addContact(new Contact("Snoop","002"));
        databaseHandler.addContact(new Contact("Nico","003"));
        databaseHandler.addContact(new Contact("Will","004"));
        databaseHandler.addContact(new Contact("Dave","005"));

        //get all contact
        List<Contact> contactList = databaseHandler.getAllContacts();
        for (Contact contact : contactList){
            Log.d(TAG, "onCreate: USER_NAME:: "+contact.getUserName());
        }

    }
}
