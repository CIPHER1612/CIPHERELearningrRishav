package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem4CE extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_ce);
        findViewById(R.id.Subj1CE).setOnClickListener(this);
        findViewById(R.id.Subj2CE).setOnClickListener(this);
        findViewById(R.id.Subj3CE).setOnClickListener(this);
        findViewById(R.id.Subj4CE).setOnClickListener(this);
        findViewById(R.id.Subj5CE).setOnClickListener(this);
        findViewById(R.id.Subj6CE).setOnClickListener(this);
        findViewById(R.id.Subj7CE).setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {/*
            case R.id.Subj1CE:
                startActivity(new Intent(this, CES4S1.class));
                break;
            case R.id.Subj2CE:
                startActivity(new Intent(this, CES4S2.class));
                break;
            case R.id.Subj3CE:
                startActivity(new Intent(this, CES4S3.class));
                break;
            case R.id.Subj4CE:
                startActivity(new Intent(this, CES4S4.class));
                break;
            case R.id.Subj5CE:
                startActivity(new Intent(this, CES4S5.class));
                break;
            case R.id.Subj6CE:
                startActivity(new Intent(this, CES4S6.class));
                break;
            case R.id.Subj7CE:
            startActivity(new Intent(this, CES4S6.class));
            break;


        */
        }

    }
}
