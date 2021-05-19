package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myFrance(View view){
        Intent NewsIntent = new Intent(MainActivity.this, France.class);
        startActivity(NewsIntent);
    }
    public void myItaly(View view){
        Intent DayIntent = new Intent(MainActivity.this, Italy.class);
        startActivity(DayIntent);
    }
    public void myGermany(View view){
        Intent FactIntent = new Intent(MainActivity.this, Germany.class);
        startActivity(FactIntent);
    }
    public void myEngland(View view){
        Intent LiveIntent = new Intent(MainActivity.this, England.class);
        startActivity(LiveIntent);
    }
}