package com.ivan_and_bernie.miaireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private ImageButton imgButtonLeft = (ImageButton) findViewById(R.id.setting)

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

    @Override
    public void onClick(View view) {

    }
}
