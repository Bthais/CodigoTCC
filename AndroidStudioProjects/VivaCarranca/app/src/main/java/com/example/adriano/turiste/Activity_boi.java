package com.example.adriano.turiste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_boi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
