package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class staffActivity<listView, string> extends AppCompatActivity {

    private Button CAB;
    private Button COGAS;
    private Button DGSR;
    private Button DAF;
    private Button DPSE;
    private Button DRH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        CAB= findViewById(R.id.CAB);
        COGAS= findViewById(R.id.COGAS);
        DGSR= findViewById(R.id.DGSR);
        DAF= findViewById(R.id.DAF);
        DPSE= findViewById(R.id.DPSE);
        DRH= findViewById(R.id.DRH);


        CAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), cab_activity.class);
                startActivity(i);

            }
        });

        COGAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), cogas_activity.class);
                startActivity(i);

            }
        });

        DGSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dgsr_activity.class);
                startActivity(i);

            }
        });

        DAF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), daf_activity.class);
                startActivity(i);

            }
        });

        DPSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dpse.class);
                startActivity(i);

            }
        });

        DRH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), drh.class);
                startActivity(i);

            }
        });
    }
}