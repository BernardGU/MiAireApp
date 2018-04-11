package com.ivan_and_bernie.miaireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LeftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Slide the activity in from the left
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        setContentView(R.layout.activity_left);
    }
}
