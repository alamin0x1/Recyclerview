package com.developeralamin.contact.nasim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.developeralamin.contact.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityNasim extends AppCompatActivity {

    List<NasimData> nasimDataList;
    RecyclerView rescyler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nasim);

        nasimDataList = new ArrayList<>();

        rescyler = findViewById(R.id.rescyler);

        nasimDataList.add(new NasimData("Nasim","nasim@gmial.com","017xxxxxxxx","https://avatars.githubusercontent.com/u/68021246?v=4"));
        nasimDataList.add(new NasimData("Al-Amin","alamin@gmial.com","017xxxxxxxx","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        nasimDataList.add(new NasimData("Nuhin","nuhine@gmial.com","017xxxxxxxx",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));

        nasimDataList.add(new NasimData("Nasim","nasim@gmial.com","017xxxxxxxx","https://avatars.githubusercontent.com/u/68021246?v=4"));
        nasimDataList.add(new NasimData("Al-Amin","alamin@gmial.com","017xxxxxxxx","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        nasimDataList.add(new NasimData("Nuhin","nuhine@gmial.com","017xxxxxxxx",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));

        nasimDataList.add(new NasimData("Nasim","nasim@gmial.com","017xxxxxxxx","https://avatars.githubusercontent.com/u/68021246?v=4"));
        nasimDataList.add(new NasimData("Al-Amin","alamin@gmial.com","017xxxxxxxx","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        nasimDataList.add(new NasimData("Nuhin","nuhine@gmial.com","017xxxxxxxx",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));

        nasimDataList.add(new NasimData("Nasim","nasim@gmial.com","017xxxxxxxx","https://avatars.githubusercontent.com/u/68021246?v=4"));
        nasimDataList.add(new NasimData("Al-Amin","alamin@gmial.com","017xxxxxxxx","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        nasimDataList.add(new NasimData("Nuhin","nuhine@gmial.com","017xxxxxxxx",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));


        NasimAdapter nasimAdapter = new NasimAdapter(this,nasimDataList);
        rescyler.setAdapter(nasimAdapter);
    }
}