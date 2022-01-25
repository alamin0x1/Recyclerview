package com.developeralamin.contact.nasim;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.developeralamin.contact.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NasimAdapter extends RecyclerView.Adapter<NasimAdapter.ViewHolder> {

    Context context;
    List<NasimData> nasimDataList;


    public NasimAdapter(Context context, List<NasimData> nasimDataList) {
        this.context = context;
        this.nasimDataList = nasimDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_nasim,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        NasimData nasimData = nasimDataList.get(position);

        holder.name.setText(nasimData.getName());
        holder.email.setText(nasimData.getEmail());
        holder.phone.setText(nasimData.getPhone());

        Glide.with(context).load(nasimData.getProfile_img()).into(holder.profile_image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailsActivityNasim.class);
                intent.putExtra("name", nasimData.getName());
                intent.putExtra("email", nasimData.getEmail());
                intent.putExtra("phone", nasimData.getPhone());
                intent.putExtra("img", nasimData.getProfile_img());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nasimDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView profile_image;
        TextView name, email, phone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile_image = itemView.findViewById(R.id.profile_image);
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);
            phone = itemView.findViewById(R.id.phone);

        }
    }
}
