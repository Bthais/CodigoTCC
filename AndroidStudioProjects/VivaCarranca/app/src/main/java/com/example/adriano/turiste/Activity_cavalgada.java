package com.example.adriano.turiste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_cavalgada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cavalgada);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
