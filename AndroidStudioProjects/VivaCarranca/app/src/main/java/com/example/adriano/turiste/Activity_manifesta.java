package com.example.adriano.turiste;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Activity_manifesta extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifesta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button botaoboi = findViewById(R.id.boi);

        botaoboi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_manifesta.this, Activity_boi.class);
                startActivity(intent);
            }
        });

        Button botaocavalhada = findViewById(R.id.cavalhada);

        botaocavalhada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_manifesta.this, Activity_cavalhada.class);
                startActivity(intent);
            }
        });

        Button botaocavalgada = findViewById(R.id.cavalgada);

        botaocavalgada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_manifesta.this, Activity_cavalgada.class);
                startActivity(intent);
            }
        });

        Button botaosantcruz = findViewById(R.id.santcruz);

        botaosantcruz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_manifesta.this, Activity_santacruz.class);
                startActivity(intent);
            }
        });

        Button botaosantrio = findViewById(R.id.santRio);

        botaosantrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_manifesta.this, Activity_santRio.class);
                startActivity(intent);
            }
        });

        Button botaomarujada = findViewById(R.id.marujada);

        botaomarujada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_manifesta.this, Activity_marujada.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    //  fab.setOnClickListener(new View.OnClickListener() {
    //    @Override
    //  public void onClick(View view) {
    //    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
    //          .setAction("Action", null).show();
    //}
    //});

    //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
    //      this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    //drawer.addDrawerListener(toggle);
    //toggle.syncState();

    //NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    //navigationView.setNavigationItemSelectedListener(this);
    //}

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_manifesta, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent i = new Intent(Activity_manifesta.this, MainActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_manage) {
            Intent i = new Intent(Activity_manifesta.this, Activity_hoteis.class);
            startActivity(i);
            // finish();

        } else if (id == R.id.nav_slideshow) {


        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
