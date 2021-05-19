package com.example.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class France extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.france);
        setTitle("Tourist spots in France");
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
        Intent RiponIntent = new Intent(France.this, France1.class);
        startActivity(RiponIntent);
    }
    public void myGov(View view){
        Intent GovIntent = new Intent(France.this, France2.class);
        startActivity(GovIntent);
    }
    public void myMarina(View view){
        Intent MarinaIntent = new Intent(France.this, France3.class);
        startActivity(MarinaIntent);
    }
    public void myTho(View view){
        Intent ThoIntent = new Intent(France.this, France4.class);
        startActivity(ThoIntent);
    }
    public void myEll(View view){
        Intent EllIntent = new Intent(France.this, France5.class);
        startActivity(EllIntent);
    }
    public void myDak(View view){
        Intent DakIntent = new Intent(France.this, France6.class);
        startActivity(DakIntent);
    }
    public void myAsh(View view){
        Intent AshIntent = new Intent(France.this, France7.class);
        startActivity(AshIntent);
    }
    public void myMy(View view){
        Intent MyIntent = new Intent(France.this, France8.class);
        startActivity(MyIntent);
    }
    public void myGui(View view){
        Intent GuiIntent = new Intent(France.this,France9.class);
        startActivity(GuiIntent);
    }
    public void myConn(View view){
        Intent ConnIntent = new Intent(France.this, France10.class);
        startActivity(ConnIntent);
    }
    public void myFish(View view){
        Intent myFishIntent = new Intent(France.this, France11.class);
        startActivity(myFishIntent);
    }

    public void mySemm(View view){
        Intent mySemmIntent = new Intent(France.this, France12.class);
        startActivity(mySemmIntent);
    }
    public void myCroc(View view){
        Intent CrocIntent = new Intent(France.this, France13.class);
        startActivity(CrocIntent);
    }
    public void myBirla(View view){
        Intent BirlaIntent = new Intent(France.this, France14.class);
        startActivity(BirlaIntent);
    }
    public void myVgp(View view){
        Intent VgpIntent = new Intent(France.this, France15.class);
        startActivity(VgpIntent);
    }
    public void myAnnai(View view){
        Intent AnnaiIntent = new Intent(France.this, France16.class);
        startActivity(AnnaiIntent);
    }
    public void myZoos(View view){
        Intent ZoosIntent = new Intent(France.this,France17.class);
        startActivity(ZoosIntent);
    }
    public void myMGR(View view){
        Intent MGRIntent = new Intent(France.this, France18.class);
        startActivity(MGRIntent);
    }
    public void myPark(View view){
        Intent ParkIntent = new Intent(France.this, France19.class);
        startActivity(ParkIntent);
    }

}
