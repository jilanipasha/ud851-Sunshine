package com.example.android.sunshine.utilities;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.android.sunshine.R;

public class SettingsActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Completed (1) Add new Activity called SettingsActivity using Android Studio wizard
        // Do step 2 in SettingsActivity
        // Completed (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        setContentView(R.layout.activity_settings);
        this.getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
