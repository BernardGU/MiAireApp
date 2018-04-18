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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class RightActivity extends AppCompatActivity {

    ListView lst;
    String[] fecha = {"04/04/18","04/04/18","04/04/18","04/04/18","04/04/18","04/04/18"};
    String[] sensor = {"1","2","1","2","3","2"};
    String[] medicion = {"1","2","3","4","5","6"};

    Dato dato;
    ArrayList <Dato> listaDatos = new ArrayList<>();
    ArrayList <String> fechaAL = new ArrayList<>();
    ArrayList <String> sensorAL = new ArrayList<>();
    ArrayList <String> medicionAL = new ArrayList<>();

    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        lst = findViewById(R.id.listview);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Lecturas");
        dato = new Dato();
        listaDatos = new ArrayList<>();

        CustomListView customListView = new CustomListView(this, fecha, sensor, medicion);
        lst.setAdapter(customListView);

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds: dataSnapshot.getChildren()) {
                    dato = ds.getValue(Dato.class);
                    fechaAL.add(dato.getFecha());
                    sensorAL.add(dato.getSensor());
                    medicionAL.add(dato.getMedicion());
                }
                fecha = fechaAL.toArray(new String[fechaAL.size()]);
                sensor = sensorAL.toArray(new String[sensorAL.size()]);
                medicion = medicionAL.toArray(new String[medicionAL.size()]);

                CustomListView customListView = new CustomListView(RightActivity.this, fecha, sensor, medicion);
                lst.setAdapter(customListView);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

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
