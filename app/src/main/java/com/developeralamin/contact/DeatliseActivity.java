package com.developeralamin.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DeatliseActivity extends AppCompatActivity {

    ImageView cover_img, profile_image;
    TextView name,email,phone,address;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatlise);

        intent = getIntent();

        cover_img = findViewById(R.id.cover_img);
        profile_image = findViewById(R.id.profile_image);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);

     String img = intent.getStringExtra("img");
     String nam =   intent.getStringExtra("name");
     String mail =  intent.getStringExtra("email");
     String moblie =  intent.getStringExtra("phone");
     String addre = intent.getStringExtra("address");

       name.setText(nam);
       email.setText(mail);
       phone.setText(moblie);
       address.setText(addre);

        Glide.with(this).load(img).into(cover_img);
        Glide.with(this).load(img).into(profile_image);




    }
}