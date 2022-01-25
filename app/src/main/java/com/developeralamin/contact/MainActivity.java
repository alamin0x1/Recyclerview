package com.developeralamin.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.developeralamin.contact.adapter.ContactAdapter;
import com.developeralamin.contact.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ContactData> contactDataList;
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactDataList = new ArrayList<>();

        recyclerview = findViewById(R.id.recyclerview);

        contactDataList.add(new ContactData("Al-Amin","alamin@gmail.com","01700000000",
                "Joypurhat","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        contactDataList.add(new ContactData("Nasim","nasim@gmail.com","01700000000",
                "Dinajpur","https://avatars.githubusercontent.com/u/68021246?v=4"));
        contactDataList.add(new ContactData("Nuhin","nuhin@gmail.com","01700000000","Joypurhat",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));

        contactDataList.add(new ContactData("Al-Amin","alamin@gmail.com","01700000000",
                "Joypurhat","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        contactDataList.add(new ContactData("Nasim","nasim@gmail.com","01700000000",
                "Dinajpur","https://avatars.githubusercontent.com/u/68021246?v=4"));
        contactDataList.add(new ContactData("Nuhin","nuhin@gmail.com","01700000000","Joypurhat",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));


        contactDataList.add(new ContactData("Al-Amin","alamin@gmail.com","01700000000",
                "Joypurhat","https://firebasestorage.googleapis.com/v0/b/alamin-sakib.appspot.com/o/sakib.png?alt=media&token=e52a6b5c-3ca0-401b-9f91-f51335626eec"));
        contactDataList.add(new ContactData("Nasim","nasim@gmail.com","01700000000",
                "Dinajpur","https://avatars.githubusercontent.com/u/68021246?v=4"));
        contactDataList.add(new ContactData("Nuhin","nuhin@gmail.com","01700000000","Joypurhat",
                "https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-1/p320x320/245249315_1005457586922444_7893493417753885531_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=7206a8&_nc_ohc=HlYn_RnBfM8AX_VTxxj&_nc_ht=scontent.fdac116-1.fna&oh=00_AT9O7twUphtv14m9Y46pnM8E0rLftYD0J07KN8t_kQg0Dw&oe=61F494FA"));


        ContactAdapter contactAdapter = new ContactAdapter(this, contactDataList);
        recyclerview.setAdapter(contactAdapter);
    }
}