package com.ivan_and_bernie.miaireapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class RightActivity extends AppCompatActivity {

    ListView lst;
    String[] fecha = {"04/04/18","04/04/18","04/04/18","04/04/18","04/04/18","04/04/18"};
    String[] sensor = {"1","2","1","2","3","2"};
    String[] medicion = {"1","2","3","4","5","6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        lst = findViewById(R.id.listview);

        CustomListView customListView= new CustomListView(this,fecha,sensor,medicion);
        lst.setAdapter(customListView);

        ImageButton buttonHome = findViewById(R.id.HomeButton2);
        buttonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                OpenHome();
            }
        });

    }
    public void OpenHome(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        //Slide the activity in from the left
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
