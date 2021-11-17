package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Hotel = findViewById(R.id.btnHotels);
        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Business.class);
                startActivity(in);
            }
        });

        ImageView Rest = findViewById(R.id.btnRestaurantes);
        Rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Restaurantes.class);
                startActivity(in);
            }
        });

        ImageView Movie = findViewById(R.id.btnMovies);
        Movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Movies.class);
                startActivity(in);
            }
        });

        ImageView Transp = findViewById(R.id.btntransport);
        Transp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Transport.class);
                startActivity(in);
            }
        });
    }

}