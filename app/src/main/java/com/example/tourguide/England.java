package com.example.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class England extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.england);
        setTitle("Tourist spots in England");
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
    public void myRipon(View view){
        Intent RiponIntent = new Intent(England.this, England1.class);
        startActivity(RiponIntent);
    }
    public void myGov(View view){
        Intent GovIntent = new Intent(England.this, England2.class);
        startActivity(GovIntent);
    }
    public void myMarina(View view){
        Intent MarinaIntent = new Intent(England.this, England3.class);
        startActivity(MarinaIntent);
    }
    public void myTho(View view){
        Intent ThoIntent = new Intent(England.this, England4.class);
        startActivity(ThoIntent);
    }
    public void myEll(View view){
        Intent EllIntent = new Intent(England.this, England5.class);
        startActivity(EllIntent);
    }
    public void myDak(View view){
        Intent DakIntent = new Intent(England.this, England6.class);
        startActivity(DakIntent);
    }
    public void myAsh(View view){
        Intent AshIntent = new Intent(England.this, England7.class);
        startActivity(AshIntent);
    }
    public void myMy(View view){
        Intent MyIntent = new Intent(England.this, England8.class);
        startActivity(MyIntent);
    }
    public void myGui(View view){
        Intent GuiIntent = new Intent(England.this,England9.class);
        startActivity(GuiIntent);
    }
    public void myConn(View view){
        Intent ConnIntent = new Intent(England.this, England10.class);
        startActivity(ConnIntent);
    }
    

}
