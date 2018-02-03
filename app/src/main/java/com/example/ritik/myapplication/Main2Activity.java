package com.example.ritik.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Main2Activity extends AppCompatActivity {
    private ListView mylist;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mylist=(ListView) findViewById(R.id.myList);
        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReferenceFromUrl("https://ritik294-e5ac8.firebaseio.com/EVENTS");

    }
}
