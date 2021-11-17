package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Hotels extends AppCompatActivity {

    Spinner spiner=findViewById(R.id.spinnerHotel);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Hotels, android.R.layout.simple_spinner_item);
        spiner.setAdapter(adapter);
    }
}