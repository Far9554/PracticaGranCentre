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
                        String[] negoci = {
                                "Peluquería Olga Camargo Gracia",
                                "Twitter",
                                "Windows",
                        } ;
                        Integer[] imageId = {
                                R.drawable.olgacam,
                                R.drawable.business_1,
                                R.drawable.business_1,
                        };
                        String[] adress = {
                                "Via Augusta, 62, 08006 Barcelona",
                                "Twitter",
                                "Windows",
                        };
                        CustomList adapter2 = new CustomList(Business.this, negoci, imageId, adress);
                        list=(ListView)findViewById(R.id.list);
                        list.setAdapter(adapter2);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "You Clicked at " +negoci[+ position], Toast.LENGTH_SHORT).show();
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
