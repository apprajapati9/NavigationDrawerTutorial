package com.example.ajay.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;



public class MainActivity extends AppCompatActivity {

   Toolbar toolbar;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

         ActionBar actionBar = getSupportActionBar();


        Profile profile = (Profile) getSupportFragmentManager().findFragmentById(R.id.profileFragmentInMain);
        profile.setUp((DrawerLayout) findViewById(R.id.drawer),toolbar);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
