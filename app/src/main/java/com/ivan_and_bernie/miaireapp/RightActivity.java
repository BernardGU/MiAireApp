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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Slide the activity in from the right
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView(R.layout.activity_right);

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
    }
}
