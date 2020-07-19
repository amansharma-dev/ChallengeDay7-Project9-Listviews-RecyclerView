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
//        databaseHandler.addContact(new Contact("James","001"));
//        databaseHandler.addContact(new Contact("Snoop","002"));
//        databaseHandler.addContact(new Contact("Nico","003"));
//        databaseHandler.addContact(new Contact("Will","004"));
//        databaseHandler.addContact(new Contact("Dave","005"));

//        databaseHandler.addContact(new Contact("Mike","006"));
//        databaseHandler.addContact(new Contact("Chris","007"));
//        databaseHandler.addContact(new Contact("Lissa","008"));
//        databaseHandler.addContact(new Contact("Trish","009"));
//        databaseHandler.addContact(new Contact("Rey","0010"));
//
//        databaseHandler.addContact(new Contact("Willams","0011"));
//        databaseHandler.addContact(new Contact("Tonny","0012"));
//        databaseHandler.addContact(new Contact("Garry","0013"));
//        databaseHandler.addContact(new Contact("Manav","0014"));
//        databaseHandler.addContact(new Contact("TimGrover","0015"));


        //get contact
//        Contact singleContact = databaseHandler.getContact(5);
        //Log.d(TAG, "onCreate: Single Contact Details:: "+singleContact.getId()+", NAME:: "+singleContact.getUserName()+", CONTACT NUMBER:: "+singleContact.getUserContactNumber());

        //update contact
//        singleContact.setUserName("Will Smith");
//        singleContact.setUserContactNumber("400");
//        int updatedContact = databaseHandler.update(singleContact);
//        Log.d(TAG, "onCreate: UPDATE ROW:: "+updatedContact);

        //delete contact;
//        databaseHandler.deleteContact(singleContact);


        //count items in database

        Log.d(TAG, "onCreate: TOTAL ITEMS IN DB:: "+databaseHandler.getCount());

        //get all contact
        List<Contact> contactList = databaseHandler.getAllContacts();
        for (Contact contact : contactList){
            Log.d(TAG, "onCreate: USER_NAME:: "+contact.getUserName());
        }

    }
}
