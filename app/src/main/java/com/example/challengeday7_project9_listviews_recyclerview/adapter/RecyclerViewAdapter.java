package com.example.challengeday7_project9_listviews_recyclerview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challengeday7_project9_listviews_recyclerview.R;
import com.example.challengeday7_project9_listviews_recyclerview.model.Contact;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


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

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Log.d("AdapterPosition", "onClick: "+position);

            switch (itemView.getId()){
                case R.id.send:

                    break;
                case R.id.name:

                    break;

                case R.id.contactNumber:

                    break;
            }

        }
    }

}
