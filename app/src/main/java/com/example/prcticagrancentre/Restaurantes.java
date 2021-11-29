package com.example.prcticagrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentById(R.id.contenidor1) == null) {
            Fragment fragment1 = new Fragment();
            fm.beginTransaction().add(R.id.contenidor1, fragment1).commit();
        }
    }
}