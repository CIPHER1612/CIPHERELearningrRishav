package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem2FT extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_ft);
        findViewById(R.id.Subj1FT).setOnClickListener(this);
        findViewById(R.id.Subj2FT).setOnClickListener(this);
        findViewById(R.id.Subj3FT).setOnClickListener(this);
        findViewById(R.id.Subj4FT).setOnClickListener(this);
        findViewById(R.id.Subj5FT).setOnClickListener(this);
        findViewById(R.id.Subj6FT).setOnClickListener(this);
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
            case R.id.Subj1FT:
                startActivity(new Intent(this, FTS2S1.class));
                break;
            case R.id.Subj2FT:
                startActivity(new Intent(this, FTS2S2.class));
                break;
            case R.id.Subj3FT:
                startActivity(new Intent(this, FTS2S3.class));
                break;
            case R.id.Subj4FT:
                startActivity(new Intent(this, FTS2S4.class));
                break;
            case R.id.Subj5FT:
                startActivity(new Intent(this, FTS2S5.class));
                break;
            case R.id.Subj6FT:
                startActivity(new Intent(this, FTS2S6.class));
                break;


        */
        }

    }
}
