package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class drh extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drh);


        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("AAAAA");
        arrayList.add("BBBBB");
        arrayList.add("CCCCCC");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}