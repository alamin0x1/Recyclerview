package com.developeralamin.contact.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.developeralamin.contact.DeatliseActivity;
import com.developeralamin.contact.R;
import com.developeralamin.contact.model.ContactData;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    Context context;
    List<ContactData> contactDataList;

    public ContactAdapter(Context context, List<ContactData> contactDataList) {
        this.context = context;
        this.contactDataList = contactDataList;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {


        ContactData contactData = contactDataList.get(position);

        holder.name.setText(contactData.getName());
        holder.email.setText(contactData.getEmail());
        holder.phone.setText(contactData.getPhone());
        holder.address.setText(contactData.getAddress());

        Glide.with(context).load(contactData.getProfile_img()).into(holder.profile_image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DeatliseActivity.class);

                intent.putExtra("name", contactData.getName());
                intent.putExtra("email", contactData.getEmail());
                intent.putExtra("phone", contactData.getPhone());
                intent.putExtra("address", contactData.getAddress());
                intent.putExtra("img", contactData.getProfile_img());

                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return contactDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView profile_image;
        TextView name, email, phone, address;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile_image = itemView.findViewById(R.id.profile_image);
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);
            phone = itemView.findViewById(R.id.phone);
            address = itemView.findViewById(R.id.address);
        }
    }
}
