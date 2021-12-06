package com.example.annuaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class territorialActivity extends AppCompatActivity {
    String[] valsTana = {"CDT CIRGN ANTANANARIVO", "GPT ANALAMANGA", "GPT VAKINAKARATRA", "GPT BONGOLAVA", "GPT ITASY"};
    String[] valsFianarantsoa = {"CDT CIRGN FIANARANTSOA","GPT HAUTE MATSIATRA","GPT ATSIMO ATSINANANA","GPT VAFI","GPT AMORON'I MANIA","GPT IHOROMBE"};
    String[]valsAntsiranana ={"CDT CIRGN ANTSIRANANA","GPT SAVA","GPT DIANA"};
    String[] valsMahajanga= {"CDT CIRGN MAHAJANGA","GPT BOENY","GPT BETSIBOKA","GPT SOFIA","GPT MELAKY"};
    String[]valsToamasina={"CDT CIRGN TOAMASINA","GPT  ATSINANANA","GPT ANALANJIROFO","GPT ALAOTRA MANGORO"};
    String[]valsToliara={"CDT CIRGN TOLIARA","GPT ATSIMO ANDREFANA","GPT ANDROY","GPT ANOSY","GPT MENABE"};

    Spinner spinnertana, spinnerfianarantsoa, spinnerantsiranana, spinnermahajanga, spinnertoamasina, spinnertoliara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_territorial);

        //tana
        spinnertana = findViewById(R.id.spinnertana);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, valsTana);
        spinnertana.setAdapter(ad);
        //Log.i("", "" + spinnertana.getChildCount());

        spinnertana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                switch (selectItem) {
                    case "CDT CIRGN ANTANANARIVO": {
                        Intent ni = new Intent(getApplicationContext(), cdt_cirgn_tana_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ANALAMANGA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_analamanga_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT VAKINAKARATRA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_vakinakaratra_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT BONGOLAVA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_bongolava_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ITASY": {
                        Intent ni = new Intent(getApplicationContext(), gpt_itasy_activity.class);
                        startActivity(ni);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //fianaratsoa
        spinnerfianarantsoa= findViewById(R.id.spinnerfianarantsoa);
        ArrayAdapter<String> ada = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, valsFianarantsoa);
        spinnerfianarantsoa.setAdapter(ada);
        //Log.i("", "" + spinnerfianarantsoa.getChildCount());
        spinnerfianarantsoa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                switch (selectItem) {
                    case "CDT CIRGN FIANARANTSOA": {
                        Intent ni = new Intent(getApplicationContext(), cdt_cirgn_fianarantsoaActivity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT HAUTE MATSIATRA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_hautematsiatraActivity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ATSIMO ATSINANANA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_atsimoAtsinanana_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT VAFI": {
                        Intent ni = new Intent(getApplicationContext(), gpt_vafi_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT AMORON'I MANIA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_amoronMania_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT IHOROMBE": {
                        Intent ni = new Intent(getApplicationContext(), gpt_itasy_activity.class);
                        startActivity(ni);
                        break;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //antsiranana
        spinnerantsiranana= findViewById(R.id.spinnerantsiranana);
        ArrayAdapter<String> adap = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, valsAntsiranana);
        spinnerantsiranana.setAdapter(adap);
        //Log.i("", "" + spinnerantsiranana.getChildCount());

        spinnerantsiranana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                switch (selectItem) {
                    case "CDT CIRGN ANTSIRANANA": {
                        Intent ni = new Intent(getApplicationContext(), cdt_cirgn_antsiranana_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT SAVA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_sava_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT DIANA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_diana_activity.class);
                        startActivity(ni);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //mahajanga
        spinnermahajanga= findViewById(R.id.spinnermahajanga);
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, valsMahajanga);
        spinnermahajanga.setAdapter(adapt);
        //Log.i("", "" + spinnermahajanga.getChildCount());

        spinnermahajanga.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                switch (selectItem) {
                    case "CDT CIRGN MAHAJANGA": {
                        Intent ni = new Intent(getApplicationContext(), cdt_cirgn_mahajanga_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT BOENY": {
                        Intent ni = new Intent(getApplicationContext(), gpt_boeny_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT BETSIBOKA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_betsiboka_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT SOFIA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_sofia_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT MELAKY": {
                        Intent ni = new Intent(getApplicationContext(), gpt_melaky_activity.class);
                        startActivity(ni);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //toamasina
        spinnertoamasina= findViewById(R.id.spinnertoamasina);
        ArrayAdapter<String> adapte = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, valsToamasina);
        spinnertoamasina.setAdapter(adapte);
       // Log.i("", "" + spinnertoamasina.getChildCount());

        spinnertoamasina.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                switch (selectItem) {
                    case "CDT CIRGN TOAMASINA": {
                        Intent ni = new Intent(getApplicationContext(), cdt_cirgn_toamasina_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT  ATSINANANA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_atsinanana_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ANALANJIROFO": {
                        Intent ni = new Intent(getApplicationContext(), gpt_analanjirofo_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ALAOTRA MANGORO": {
                        Intent ni = new Intent(getApplicationContext(), gpt_alaotraMangoro_activity.class);
                        startActivity(ni);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //toliara
        spinnertoliara= findViewById(R.id.spinnertoliara);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, valsToliara);
        spinnertoliara.setAdapter(adapter);
        //Log.i("", "" + spinnertoliara.getChildCount());

        spinnertoliara.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectItem = adapterView.getItemAtPosition(i).toString();
                System.out.println(selectItem);
                switch (selectItem) {
                    case "CDT CIRGN TOLIARA": {
                        Intent ni = new Intent(getApplicationContext(), cdt_cirgn_toliara_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ATSIMO ANDREFANA": {
                        Intent ni = new Intent(getApplicationContext(), gpt_atsimoAndrefana_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ANDROY": {
                        Intent ni = new Intent(getApplicationContext(), gpt_androy_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT ANOSY": {
                        Intent ni = new Intent(getApplicationContext(), gpt_anosy_activity.class);
                        startActivity(ni);
                        break;
                    }
                    case "GPT MENABE": {
                        Intent ni = new Intent(getApplicationContext(), gpt_menabe_activity.class);
                        startActivity(ni);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}