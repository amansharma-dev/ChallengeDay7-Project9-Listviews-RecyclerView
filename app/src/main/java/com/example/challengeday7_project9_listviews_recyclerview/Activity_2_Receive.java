package com.example.challengeday7_project9_listviews_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_2_Receive extends AppCompatActivity {

    private TextView textView_name;
    private TextView textView_contactNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2__receive);

        textView_name = findViewById(R.id.receive_name);
        textView_contactNumber = findViewById(R.id.receive_contactNumber);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String name =  bundle.getString("user_name");
            String contactNumber =  bundle.getString("user_contactNumber");

            textView_name.setText(name);
            textView_contactNumber.setText(contactNumber);
        }
    }
}
