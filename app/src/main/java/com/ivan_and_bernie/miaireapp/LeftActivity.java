package com.ivan_and_bernie.miaireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LeftActivity extends AppCompatActivity {
    private ImageButton buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Slide the activity in from the left
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        setContentView(R.layout.activity_left);

        buttonHome = findViewById(R.id.HomeButton);
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
