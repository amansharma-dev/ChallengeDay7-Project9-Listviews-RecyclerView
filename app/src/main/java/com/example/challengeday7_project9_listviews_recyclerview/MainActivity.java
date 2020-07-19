package com.example.challengeday7_project9_listviews_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.challengeday7_project9_listviews_recyclerview.data.DatabaseHandler;
import com.example.challengeday7_project9_listviews_recyclerview.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(MainActivity.this);

        listView = findViewById(R.id.listView);

        contactArrayList = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,contactArrayList);



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
            contactArrayList.add(contact.getUserName());
        }



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick: "+contactArrayList.get(i));
            }
        });

        listView.setAdapter(arrayAdapter);
    }
}
