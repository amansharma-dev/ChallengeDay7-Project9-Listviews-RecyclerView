package com.example.challengeday7_project9_listviews_recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challengeday7_project9_listviews_recyclerview.Activity_2_Receive;
import com.example.challengeday7_project9_listviews_recyclerview.R;
import com.example.challengeday7_project9_listviews_recyclerview.model.Contact;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {



    public static final String TAG = "RVAdapter";
    private Context context;
    private List<Contact> contactList;

    public RecyclerViewAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_cardview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Contact contact = contactList.get(position);
        viewHolder.textView_name.setText(contact.getUserName());
        viewHolder.textView_contactNumber.setText(contact.getUserContactNumber());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView textView_name;
        public TextView textView_contactNumber;
        public Button button_send;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_name = itemView.findViewById(R.id.name);
            textView_contactNumber = itemView.findViewById(R.id.contactNumber);
            button_send = itemView.findViewById(R.id.send);


            textView_name.setOnClickListener(this);
//            itemView.setOnClickListener(this);
            button_send.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Contact contact = contactList.get(position);
            Log.d(TAG, "onClick: position:: "+position);

            switch (view.getId()){
                case R.id.send:
                    Intent intent = new Intent(context, Activity_2_Receive.class);
                    intent.putExtra("user_name",contact.getUserName());
                    intent.putExtra("user_contactNumber",contact.getUserContactNumber());
                    context.startActivity(intent);
                    break;
                case R.id.name:
                    Log.d(TAG, "onClick: name:: "+contact.getUserName());
                    break;

                case R.id.contactNumber:
                    Log.d(TAG, "onClick: name:: "+contact.getUserContactNumber());
                    break;
            }

        }
    }

}
