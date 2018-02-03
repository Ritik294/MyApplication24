package com.example.ritik.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button START;
    Switch S1;
    private ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist=(ListView) findViewById(R.id.myList);
        // initiate view's
        S1 = (Switch) findViewById(R.id.usertypeswitch);

        START = (Button) findViewById(R.id.button);
        START.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (S1.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(intent);
                } else {
                    Intent intent1 = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(intent1);
                }
                Toast.makeText(getApplicationContext(), " CONGO" + S1, Toast.LENGTH_LONG).show(); // display the current state for switch's


            }


        });
    }
}