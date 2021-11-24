package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Restaurantes extends AppCompatActivity {

    Spinner opciones;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Restaurant");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Restaurantes.super.onBackPressed();
            }
        });

        opciones = (Spinner) findViewById(R.id.sp01);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.BusinessR, android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);
        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                switch (selectedClass)
                {
                    case"Italia":
                        break;
                    case"Japones":
                        String[] negociR =getResources().getStringArray(R.array.negociP);
                        Integer[] imageR = {
                                R.drawable.iconatarasii,
                                R.drawable.business_1,
                                R.drawable.business_1,
                        };
                        String[] adressR =getResources().getStringArray(R.array.adressR);
                        String[] urlR =getResources().getStringArray(R.array.urlR);
                        String[] telR =getResources().getStringArray(R.array.telR);
                        String[] ubiR =getResources().getStringArray(R.array.ubiP);

                        CustomList adapter2 = new CustomList(Restaurantes.this, negociR, imageR, adressR,urlR,telR, ubiR);
                        list=(ListView)findViewById(R.id.listR);
                        list.setAdapter(adapter2);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                Toast.makeText(getApplicationContext(), "You Clicked at " +negociR[+ position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                    case"Español":
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}