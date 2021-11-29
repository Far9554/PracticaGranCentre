package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Movies extends AppCompatActivity {

    ListView listm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        String[] nomM =getResources().getStringArray(R.array.movieTi);
        int[] imagem = { R.drawable.dune, R.drawable.alerta, R.drawable.free,R.drawable.escuadron};
        String[] movieDesc =getResources().getStringArray(R.array.movieDesc);

        listm=(ListView) findViewById(R.id.listmovie);
        listm.setAdapter(new Fragment(this,nomM,imagem,movieDesc));
    }
}