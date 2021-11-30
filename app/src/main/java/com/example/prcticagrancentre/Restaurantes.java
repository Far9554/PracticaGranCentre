package com.example.prcticagrancentre;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

    Spinner spinnerB;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        spinnerB = (Spinner) findViewById(R.id.sp01);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.BusinessR, android.R.layout.simple_spinner_item);
        spinnerB.setAdapter(adapter);
        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                switch (selectedClass)
                {
                    case "Japones":
                        String[] negociJap =getResources().getStringArray(R.array.negociRJap);
                        Integer[] imageJap = { R.drawable.iconatarasii, R.drawable.iconwok, R.drawable.raval};
                        String[] adressJap =getResources().getStringArray(R.array.adressRJap);
                        String[] urlJap=getResources().getStringArray(R.array.urlRJap);
                        String[] telJap=getResources().getStringArray(R.array.telRJap);
                        String[] ubiJap =getResources().getStringArray(R.array.ubiRJap);
                        CustomList adapter0 = new CustomList(Restaurantes.this, negociJap, imageJap, adressJap, urlJap, telJap, ubiJap);
                        list=(ListView)findViewById(R.id.listR);
                        list.setAdapter(adapter0);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "Has clicado " +negociJap[+ position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                    case "Italia":
                        String[] negociIta =getResources().getStringArray(R.array.negociRIta);
                        Integer[] imageIta = { R.drawable.iconitaliano1, R.drawable.iconitaliano2, R.drawable.iconitaliano3};
                        String[] adressIta =getResources().getStringArray(R.array.adressRIta);
                        String[] urlIta =getResources().getStringArray(R.array.urlRIta);
                        String[] telIta =getResources().getStringArray(R.array.telRIta);
                        String[] ubiIta =getResources().getStringArray(R.array.ubiRIta);
                        CustomList adapter1 = new CustomList(Restaurantes.this, negociIta, imageIta, adressIta,urlIta,telIta,ubiIta);
                        list=(ListView)findViewById(R.id.listR);
                        list.setAdapter(adapter1);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "Has clicado " +negociIta[+ position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;

                    case "Español":

                        String[] negociP =getResources().getStringArray(R.array.negociP);
                        Integer[] imageP = { R.drawable.olgacam, R.drawable.ninapeines, R.drawable.iconengruna};
                        String[] adressP =getResources().getStringArray(R.array.adressP);
                        String[] urlP =getResources().getStringArray(R.array.urlP);
                        String[] telP =getResources().getStringArray(R.array.telP);
                        String[] ubiP =getResources().getStringArray(R.array.ubiP);
                        CustomList adapter2 = new CustomList(Restaurantes.this, negociP, imageP, adressP,urlP,telP,ubiP);
                        list=(ListView)findViewById(R.id.listR);
                        list.setAdapter(adapter2);
                        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "Has clicado " +negociP[+ position], Toast.LENGTH_SHORT).show();
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