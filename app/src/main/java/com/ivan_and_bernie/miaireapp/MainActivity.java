package com.ivan_and_bernie.miaireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLeft() {
        Intent myIntent = new Intent(MainActivity.this, LeftActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void goToRight() {
        Intent myIntent = new Intent(MainActivity.this, LeftActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
