package com.example.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Italy extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.italy);
        setTitle("Tourist Spots in Italy ");
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
        Intent RiponIntent = new Intent(Italy.this, Italy1.class);
        startActivity(RiponIntent);
    }
    public void myGov(View view){
        Intent GovIntent = new Intent(Italy.this, Italy2.class);
        startActivity(GovIntent);
    }
    public void myMarina(View view){
        Intent MarinaIntent = new Intent(Italy.this, Italy3.class);
        startActivity(MarinaIntent);
    }
    public void myTho(View view){
        Intent ThoIntent = new Intent(Italy.this, Italy4.class);
        startActivity(ThoIntent);
    }
    public void myEll(View view){
        Intent EllIntent = new Intent(Italy.this, Italy5.class);
        startActivity(EllIntent);
    }
    public void myDak(View view){
        Intent DakIntent = new Intent(Italy.this,Italy6.class);
        startActivity(DakIntent);
    }
    public void myAsh(View view){
        Intent AshIntent = new Intent(Italy.this, Italy7.class);
        startActivity(AshIntent);
    }
    public void myMy(View view){
        Intent MyIntent = new Intent(Italy.this, Italy8.class);
        startActivity(MyIntent);
    }
    public void myGui(View view){
        Intent GuiIntent = new Intent(Italy.this, Italy9.class);
        startActivity(GuiIntent);
    }
    public void myConn(View view){
        Intent ConnIntent = new Intent(Italy.this, Italy10.class);
        startActivity(ConnIntent);
    }
    public void myFish(View view){
        Intent myFishIntent = new Intent(Italy.this, Italy11.class);
        startActivity(myFishIntent);
    }

    public void mySemm(View view){
        Intent mySemmIntent = new Intent(Italy.this, Italy12.class);
        startActivity(mySemmIntent);
    }
    public void myCroc(View view){
        Intent CrocIntent = new Intent(Italy.this, Italy13.class);
        startActivity(CrocIntent);
    }
    public void myBirla(View view){
        Intent BirlaIntent = new Intent(Italy.this, Italy14.class);
        startActivity(BirlaIntent);
    }
    public void myVgp(View view){
        Intent VgpIntent = new Intent(Italy.this, Italy15.class);
        startActivity(VgpIntent);
    }
    public void myAnnai(View view){
        Intent AnnaiIntent = new Intent(Italy.this, Italy16.class);
        startActivity(AnnaiIntent);
    }
    public void myZoos(View view){
        Intent ZoosIntent = new Intent(Italy.this,Italy17.class);
        startActivity(ZoosIntent);
    }
    public void myMGR(View view){
        Intent MGRIntent = new Intent(Italy.this, Italy18.class);
        startActivity(MGRIntent);
    }
    public void myPark(View view){
        Intent ParkIntent = new Intent(Italy.this, Italy19.class);
        startActivity(ParkIntent);
    }

}
