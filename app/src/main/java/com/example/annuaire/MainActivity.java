package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.actualiser) {
            Toast.makeText(this, "actualise", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.search) {
            Toast.makeText(this, "search clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    CardView staff;
    CardView direction;
    CardView territorial;
    CardView mobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        staff = findViewById(R.id.staff);
        direction = findViewById(R.id.direction);
        territorial = findViewById(R.id.territorial);
        mobile = findViewById(R.id.mobile);


        staff.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), staffActivity.class);
            startActivity(i);

        });
        direction.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), directionActivity.class);
            startActivity(i);

        });
        territorial.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), territorialActivity.class);
            startActivity(i);

        });
        mobile.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), mobileActivity.class);
            startActivity(i);

        });


    }





}

