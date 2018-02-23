
package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem4EC extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_ec);
        findViewById(R.id.Subj1EC).setOnClickListener(this);
        findViewById(R.id.Subj2EC).setOnClickListener(this);
        findViewById(R.id.Subj3EC).setOnClickListener(this);
        findViewById(R.id.Subj4EC).setOnClickListener(this);
        findViewById(R.id.Subj5EC).setOnClickListener(this);
        findViewById(R.id.Subj6EC).setOnClickListener(this);
        findViewById(R.id.Subj7EC).setOnClickListener(this);
        findViewById(R.id.Subj8EC).setOnClickListener(this);
        findViewById(R.id.Subj9EC).setOnClickListener(this);

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
            case R.id.Subj1EC:
                startActivity(new Intent(this, ECS4S1.class));
                break;
            case R.id.Subj2EC:
                startActivity(new Intent(this, ECS4S2.class));
                break;
            case R.id.Subj3EC:
                startActivity(new Intent(this, ECS4S3.class));
                break;
            case R.id.Subj4EC:
                startActivity(new Intent(this, ECS4S4.class));
                break;
            case R.id.Subj5EC:
                startActivity(new Intent(this, ECS4S5.class));
                break;
            case R.id.Subj6EC:
                startActivity(new Intent(this, ECS4S6.class));
                break;
            case R.id.Subj7EC:
                startActivity(new Intent(this, ECS4S7.class));
                break;
            case R.id.Subj8EC:
                startActivity(new Intent(this, ECS4S8.class));
                break;
            case R.id.Subj9EC:
                startActivity(new Intent(this, ECS4S9.class));
                break;


        */
    }

}
//}
