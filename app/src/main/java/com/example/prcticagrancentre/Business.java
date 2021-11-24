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

                        break;
                    case "Floreries":


                        break;

                    case "Libreries":

                        String[] negociP =getResources().getStringArray(R.array.negociP);
                        Integer[] imageP = {
                                R.drawable.olgacam,
                                R.drawable.ninapeines,
                                R.drawable.business_1,
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
