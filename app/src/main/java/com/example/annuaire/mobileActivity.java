package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class mobileActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
        listView = findViewById(R.id.listView);
        //SimpleCursorAdapter simpleCursorAdapter= databaseAdapter.populatelistViewFromDb();
        //listView.setAdapter(simpleCursorAdapter);

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("AAAAA");
        arrayList.add("BBBBB");
        arrayList.add("CCCCCC");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}