package com.developeralamin.contact.nasim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.developeralamin.contact.R;

public class DetailsActivityNasim extends AppCompatActivity {

    ImageView cover_img, profile_image;
    TextView name,email,phone;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_nasim);

        intent = getIntent();

        cover_img = findViewById(R.id.cover_img);
        profile_image = findViewById(R.id.profile_image);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);


        String img = intent.getStringExtra("img");
        String nam =   intent.getStringExtra("name");
        String mail =  intent.getStringExtra("email");
        String moblie =  intent.getStringExtra("phone");

        name.setText(nam);
        email.setText(mail);
        phone.setText(moblie);

        Glide.with(this).load(img).into(cover_img);
        Glide.with(this).load(img).into(profile_image);
    }
}