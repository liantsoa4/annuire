package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class cab_activity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab);

        //PreCreateDB.copyDB(context: this);
        //databaseAdapter= new databaseAdapter(context: this);
        listView = findViewById(R.id.listView);
        //SimpleCursorAdapter simpleCursorAdapter= databaseAdapter.populateListViewFromDB();
        //listView.setAdapter(simpleCursorAdapter);

        //SimpleCursorAdapter simpleCursorAdapter = databaseA

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("AAAAA");
        arrayList.add("BBBBB");
        arrayList.add("CCCCCC");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);




    }
}