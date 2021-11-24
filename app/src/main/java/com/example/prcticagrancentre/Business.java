package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;


public class Business extends AppCompatActivity {

    Spinner spinnerB;

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        spinnerB = (Spinner) findViewById(R.id.spinnerBusi);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Business, android.R.layout.simple_spinner_item);
        spinnerB.setAdapter(adapter);
        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                switch (selectedClass)
                {
                    case "Perruqueries":
                        String[] negociLi =getResources().getStringArray(R.array.negociFlo);
                        Integer[] imageLi = {
                                R.drawable.alibri,
                                R.drawable.altair,
                                R.drawable.raval,
                        };
                        String[] adressLi =getResources().getStringArray(R.array.adressFlo);
                        String[] urlLi=getResources().getStringArray(R.array.urlFlo);
                        String[] telLi=getResources().getStringArray(R.array.telFlo);
                        String[] ubiLi =getResources().getStringArray(R.array.ubiFlo);
                        CustomList adapter0 = new CustomList(Business.this, negociLi, imageLi, adressLi,urlLi,telLi,ubiLi);
                        list=(ListView)findViewById(R.id.list);
                        list.setAdapter(adapter0);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "You Clicked at " +negociLi[+ position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                    case "Floreries":
                        String[] negociFlo =getResources().getStringArray(R.array.negociFlo);
                        Integer[] imageFlo = {
                                R.drawable.herbs,
                                R.drawable.ladyflor,
                                R.drawable.lotus,
                        };
                        String[] adressFlo =getResources().getStringArray(R.array.adressFlo);
                        String[] urlFlo =getResources().getStringArray(R.array.urlFlo);
                        String[] telFlo =getResources().getStringArray(R.array.telFlo);
                        String[] ubiFlo =getResources().getStringArray(R.array.ubiFlo);
                        CustomList adapter1 = new CustomList(Business.this, negociFlo, imageFlo, adressFlo,urlFlo,telFlo,ubiFlo);
                        list=(ListView)findViewById(R.id.list);
                        list.setAdapter(adapter1);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "You Clicked at " +negociFlo[+ position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;

                    case "Libreries":

                        String[] negociP =getResources().getStringArray(R.array.negociP);
                        Integer[] imageP = {
                                R.drawable.olgacam,
                                R.drawable.ninapeines,
                                R.drawable.antoni,
                        };
                        String[] adressP =getResources().getStringArray(R.array.adressP);
                        String[] urlP =getResources().getStringArray(R.array.urlP);
                        String[] telP =getResources().getStringArray(R.array.telP);
                        String[] ubiP =getResources().getStringArray(R.array.ubiP);
                        CustomList adapter2 = new CustomList(Business.this, negociP, imageP, adressP,urlP,telP,ubiP);
                        list=(ListView)findViewById(R.id.list);
                        list.setAdapter(adapter2);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "You Clicked at " +negociP[+ position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
