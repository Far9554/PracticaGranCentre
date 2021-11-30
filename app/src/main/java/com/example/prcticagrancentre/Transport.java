package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class Transport extends AppCompatActivity {

    ListView listP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        String[] nomM =getResources().getStringArray(R.array.ParkingNom);
        int[] imagem = { R.drawable.parkinggranollers, R.drawable.parkinggranollers1, R.drawable.parkinggranollers3};
        String[] parkNum =getResources().getStringArray(R.array.ParkingNum);
        //String[] parkTot =getResources().getStringArray(R.array.ParkingTotal);

        listP=(ListView) findViewById(R.id.listParking);
        //parkTot
        listP.setAdapter(new Fragment(this,nomM,imagem,parkNum));
    }
}