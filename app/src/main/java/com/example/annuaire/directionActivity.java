package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class directionActivity extends AppCompatActivity {

    private Button COMCAB;
    private Button DLI;
    private Button DPJ;
    private Button DOE;
    private Button DQG;
    private Button DGP;
    private Button DSIT;
    private Button DSR;
    private Button DT;
    private Button CEGN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        COMCAB= findViewById(R.id.COMCAB);
        DLI= findViewById(R.id.DLI);
        DPJ= findViewById(R.id.DPJ);
        DOE= findViewById(R.id.DOE);
        DQG= findViewById(R.id.DQG);
        DGP= findViewById(R.id.DGP);
        DSIT= findViewById(R.id.DSIT);
        DSR= findViewById(R.id.DSR);
        DT= findViewById(R.id.DT);
        CEGN= findViewById(R.id.CEGN);

        COMCAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), comcab_activity.class);
                startActivity(i);

            }
        });

        DLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dli_activity.class);
                startActivity(i);

            }
        });

        DPJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dpj.class);
                startActivity(i);

            }
        });

        DOE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), doe_activity.class);
                startActivity(i);

            }
        });

        DQG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dqg_activity.class);
                startActivity(i);

            }
        });

        DGP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dgp_activity.class);
                startActivity(i);

            }
        });

        DSIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dsit_activity.class);
                startActivity(i);

            }
        });

        DSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dsr_activity.class);
                startActivity(i);

            }
        });

        DT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dt_activity.class);
                startActivity(i);

            }
        });

        CEGN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), cegn_activity.class);
                startActivity(i);

            }
        });

    }
}