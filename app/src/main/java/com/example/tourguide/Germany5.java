package com.example.tourguide;

import android.os.Bundle;
import android.view.ActionProvider;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Germany5 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.germany5);
        setTitle("Cologne Cathedral");
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
