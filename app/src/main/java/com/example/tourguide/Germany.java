package com.example.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Germany extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.germany);
        setTitle("Tourist spots in Germany ");
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
        Intent RiponIntent = new Intent(Germany.this, Germany1.class);
        startActivity(RiponIntent);
    }
    public void myGov(View view){
        Intent GovIntent = new Intent(Germany.this, Germany2.class);
        startActivity(GovIntent);
    }
    public void myMarina(View view){
        Intent MarinaIntent = new Intent(Germany.this, Germany3.class);
        startActivity(MarinaIntent);
    }
    public void myTho(View view){
        Intent ThoIntent = new Intent(Germany.this, Germany4.class);
        startActivity(ThoIntent);
    }
    public void myEll(View view){
        Intent EllIntent = new Intent(Germany.this, Germany5.class);
        startActivity(EllIntent);
    }
    public void myDak(View view){
        Intent DakIntent = new Intent(Germany.this, Germany6.class);
        startActivity(DakIntent);
    }
    public void myAsh(View view){
        Intent AshIntent = new Intent(Germany.this, Germany7.class);
        startActivity(AshIntent);
    }
    public void myMy(View view){
        Intent MyIntent = new Intent(Germany.this, Germany8.class);
        startActivity(MyIntent);
    }
    public void myGui(View view){
        Intent GuiIntent = new Intent(Germany.this,Germany9.class);
        startActivity(GuiIntent);
    }
    public void myConn(View view){
        Intent ConnIntent = new Intent(Germany.this, Germany10.class);
        startActivity(ConnIntent);
    }
    public void myFish(View view){
        Intent myFishIntent = new Intent(Germany.this, Germany11.class);
        startActivity(myFishIntent);
    }

    public void mySemm(View view){
        Intent mySemmIntent = new Intent(Germany.this, Germany12.class);
        startActivity(mySemmIntent);
    }
    public void myCroc(View view){
        Intent CrocIntent = new Intent(Germany.this, Germany13.class);
        startActivity(CrocIntent);
    }
    public void myBirla(View view){
        Intent BirlaIntent = new Intent(Germany.this, Germany14.class);
        startActivity(BirlaIntent);
    }
    public void myVgp(View view){
        Intent VgpIntent = new Intent(Germany.this, Germany15.class);
        startActivity(VgpIntent);
    }
    public void myAnnai(View view){
        Intent AnnaiIntent = new Intent(Germany.this, Germany16.class);
        startActivity(AnnaiIntent);
    }
    public void myZoos(View view){
        Intent ZoosIntent = new Intent(Germany.this,Germany17.class);
        startActivity(ZoosIntent);
    }
    public void myMGR(View view){
        Intent MGRIntent = new Intent(Germany.this, Germany18.class);
        startActivity(MGRIntent);
    }
    public void myPark(View view){
        Intent ParkIntent = new Intent(Germany.this, Germany19.class);
        startActivity(ParkIntent);
    }


}
