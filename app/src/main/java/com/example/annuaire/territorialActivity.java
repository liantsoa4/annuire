package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class territorialActivity extends AppCompatActivity {
    String[] valsTana = {"CDT CIRGN ANTANANARIVO", "GPT ANALAMANGA", "GPT VAKINAKARATRA", "GPT BONGOLAVA", "GPT ITASY"};

    Spinner spinnertana, spinnerfianarantsoa, spinnerantsiranana, spinnermahajanga, spinnertoamasina, spinnertoliara;
    ArrayList<String> arrayList_tana;
    ArrayAdapter<String> arrayAdapter_tana;
    ArrayList<String> arrayList_fianarantsoa;
    ArrayAdapter<String> arrayAdapter_fianarantsoa;
    ArrayList<String> arrayList_antsiranana;
    ArrayAdapter<String> arrayAdapter_antsiranana;
    ArrayList<String> arrayList_mahajanga;
    ArrayAdapter<String> arrayAdapter_mahajanga;
    ArrayList<String> arrayList_toamasina;
    ArrayAdapter<String> arrayAdapter_toamasina;
    ArrayList<String> arrayList_toliara;
    ArrayAdapter<String> arrayAdapter_toliara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_territorial);
        System.out.println("erreur");

        spinnertana = (Spinner) findViewById(R.id.spinnertana);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, valsTana);
        spinnertana.setAdapter(ad);
        Log.i("", "" + spinnertana.getChildCount());

        spinnertana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                if (selectItem == "GPT ANALAMANGA"){
                    Intent ni = new Intent(getApplicationContext(), gpt_analamanga_activity.class);
                    startActivity(ni);
                }
                else if(selectItem == "GPT VAKINAKARATRA"){
                    Intent ni = new Intent(getApplicationContext(), gpt_vakinakaratra_activity.class);
                    startActivity(ni);
                }
                else if (selectItem == "CDT CIRGN ANTANANARIVO"){
                    Intent ni = new Intent(getApplicationContext(), cdt_cirgn_tana_activity.class);
                    startActivity(ni);
                }
                if (selectItem == "GPT BONGOLAVA"){
                    Intent ni = new Intent(getApplicationContext(),     gpt_bongolava_activity.class);
                    startActivity(ni);
                }
                if (selectItem == "GPT ITASY"){
                    Intent ni = new Intent(getApplicationContext(), gpt_itasy_activity.class);
                    startActivity(ni);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerantsiranana=(Spinner)findViewById(R.id.spinnerantsiranana);
        spinnerfianarantsoa=(Spinner)findViewById(R.id.spinnerfianarantsoa);
        spinnermahajanga=(Spinner)findViewById(R.id.spinnermahajanga);
        spinnertoamasina=(Spinner)findViewById(R.id.spinnertoamasina);
        spinnertoliara=(Spinner)findViewById(R.id.spinnertoliara);

        //tana
        /*arrayList_tana=new ArrayList<>();
        arrayList_tana.add("CDT CIRGN ANTANANARIVO");
        arrayList_tana.add("GPT ANALAMANGA");
        arrayList_tana.add("GPT VAKINAKARATRA");
        arrayList_tana.add("GPT BONGOLAVA");
        arrayList_tana.add("GPT ITASY");
        arrayAdapter_tana=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_tana);
        spinnertana.setAdapter(arrayAdapter_tana);
       });*/

        //fianara
        arrayList_fianarantsoa=new ArrayList<>();
        arrayList_fianarantsoa.add("CDT CIRGN FIANARANTSOA");
        arrayList_fianarantsoa.add("GPT HAUTE MATSIATRA");
        arrayList_fianarantsoa.add("GPT ATSIMO ATSINANANA");
        arrayList_fianarantsoa.add("GPT VAFI");
        arrayList_fianarantsoa.add("GPT AMORON'I MANIA");
        arrayList_fianarantsoa.add("GPT IHOROMBE");
        arrayAdapter_fianarantsoa=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_fianarantsoa);
        spinnerfianarantsoa.setAdapter(arrayAdapter_fianarantsoa);

        //antsiranana
        arrayList_antsiranana=new ArrayList<>();
        arrayList_antsiranana.add("CDT CIRGN ANTSIRANANA");
        arrayList_antsiranana.add("GPT SAVA");
        arrayList_antsiranana.add("GPT DIANA");
        arrayAdapter_antsiranana=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_antsiranana);
        spinnerantsiranana.setAdapter(arrayAdapter_antsiranana)
        ;

        //mahajanga
        arrayList_mahajanga=new ArrayList<>();
        arrayList_mahajanga.add("CDT CIRGN MAHAJANGA");
        arrayList_mahajanga.add("GPT BOENY");
        arrayList_mahajanga.add("GPT BETSIBOKA");
        arrayList_mahajanga.add("GPT SOFIA");
        arrayList_mahajanga.add("GPT MELAKY");
        arrayAdapter_mahajanga=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_mahajanga);
        spinnermahajanga.setAdapter(arrayAdapter_mahajanga);

        //toamasina
        arrayList_toamasina=new ArrayList<>();
        arrayList_toamasina.add("CDT CIRGN TOAMASINA");
        arrayList_toamasina.add("GPT  ATSINANANA");
        arrayList_toamasina.add("GPT ANALANJIROFO");
        arrayList_toamasina.add("GPT ALAOTRA MANGORO");
        arrayAdapter_toamasina=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_toamasina);
        spinnertoamasina.setAdapter(arrayAdapter_toamasina);

        //toliara
        arrayList_toliara=new ArrayList<>();
        arrayList_toliara.add("CDT CIRGN TOLIARA");
        arrayList_toliara.add("GPT ATSIMO ANDREFANA");
        arrayList_toliara.add("GPT ANDROY");
        arrayList_toliara.add("GPT ANOSY");
        arrayList_toliara.add("GPT MENABE");
        arrayAdapter_toliara=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_toliara);
        spinnertoliara.setAdapter(arrayAdapter_toliara);

    }
}