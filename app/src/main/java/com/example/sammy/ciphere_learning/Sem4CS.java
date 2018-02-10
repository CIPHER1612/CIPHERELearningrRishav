
package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem4CS extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_cs);
        findViewById(R.id.Subj1CS).setOnClickListener(this);
        findViewById(R.id.Subj2CS).setOnClickListener(this);
        findViewById(R.id.Subj3CS).setOnClickListener(this);
        findViewById(R.id.Subj4CS).setOnClickListener(this);
        findViewById(R.id.Subj5CS).setOnClickListener(this);
        findViewById(R.id.Subj6CS).setOnClickListener(this);
        findViewById(R.id.Subj7CS).setOnClickListener(this);
        findViewById(R.id.Subj8CS).setOnClickListener(this);
        findViewById(R.id.Subj9CS).setOnClickListener(this);

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
    public void onClick(View view) {/*
        switch (view.getId()) {
            case R.id.Subj1CS:
                startActivity(new Intent(this, CSS4S1.class));
                break;
            case R.id.Subj2CS:
                startActivity(new Intent(this, CSS4S2.class));
                break;
            case R.id.Subj3CS:
                startActivity(new Intent(this, CSS4S3.class));
                break;
            case R.id.Subj4CS:
                startActivity(new Intent(this, CSS4S4.class));
                break;
            case R.id.Subj5CS:
                startActivity(new Intent(this, CSS4S5.class));
                break;
            case R.id.Subj6CS:
                startActivity(new Intent(this, CSS4S6.class));
                break;
            case R.id.Subj7CS:
                startActivity(new Intent(this, CSS4S7.class));
                break;
            case R.id.Subj8CS:
                startActivity(new Intent(this, CSS4S8.class));
                break;
            case R.id.Subj9CS:
                startActivity(new Intent(this, CSS4S9.class));
                break;


        */
    }

}
//}
