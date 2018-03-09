package com.example.sammy.ciphere_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class L101 extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l101);
        findViewById(R.id.ch1p1).setOnClickListener(this);
        findViewById(R.id.ch1p2).setOnClickListener(this);
        findViewById(R.id.ch1p3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


    }
}
