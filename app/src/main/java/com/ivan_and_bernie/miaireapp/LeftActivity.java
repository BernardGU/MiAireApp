package com.ivan_and_bernie.miaireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LeftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);

        ImageButton buttonHome = findViewById(R.id.HomeButton);
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
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
