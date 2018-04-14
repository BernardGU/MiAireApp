package com.ivan_and_bernie.miaireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declare imageButtons
    private ImageButton imgButtonLeft;
    private ImageButton imgButtonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView(R.layout.activity_main);

        //Define imageButtons
        imgButtonLeft = (ImageButton) findViewById(R.id.ConfigImageButton);
        imgButtonRight = (ImageButton) findViewById(R.id.ListimageButton);

        //Set OnClickListeners to imageButtons
        imgButtonLeft.setOnClickListener(this);
        imgButtonRight.setOnClickListener(this);
    }

    public void goToLeft() {
        Intent myIntent = new Intent(MainActivity.this, LeftActivity.class);
        MainActivity.this.startActivity(myIntent);
        //Slide the activity in from the left
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void goToRight() {
        Intent myIntent = new Intent(MainActivity.this, RightActivity.class);
        MainActivity.this.startActivity(myIntent);
        //Slide the activity in from the left
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ConfigImageButton:
                goToLeft();
                break;
            case R.id.ListimageButton:
                goToRight();
                break;
        }
    }
}
