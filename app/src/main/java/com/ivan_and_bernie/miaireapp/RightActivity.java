package com.ivan_and_bernie.miaireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Slide the activity in from the right
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView(R.layout.activity_right);
    }
}
