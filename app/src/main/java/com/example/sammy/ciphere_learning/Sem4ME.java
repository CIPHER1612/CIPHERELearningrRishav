
package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem4ME extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_me);
        findViewById(R.id.Subj1ME).setOnClickListener(this);
        findViewById(R.id.Subj2ME).setOnClickListener(this);
        findViewById(R.id.Subj3ME).setOnClickListener(this);
        findViewById(R.id.Subj4ME).setOnClickListener(this);
        findViewById(R.id.Subj5ME).setOnClickListener(this);
        findViewById(R.id.Subj6ME).setOnClickListener(this);
        findViewById(R.id.Subj7ME).setOnClickListener(this);
        findViewById(R.id.Subj8ME).setOnClickListener(this);
        findViewById(R.id.Subj9ME).setOnClickListener(this);

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
            case R.id.Subj1ME:
                startActivity(new Intent(this, MES4S1.class));
                break;
            case R.id.Subj2ME:
                startActivity(new Intent(this, MES4S2.class));
                break;
            case R.id.Subj3ME:
                startActivity(new Intent(this, MES4S3.class));
                break;
            case R.id.Subj4ME:
                startActivity(new Intent(this, MES4S4.class));
                break;
            case R.id.Subj5ME:
                startActivity(new Intent(this, MES4S5.class));
                break;
            case R.id.Subj6ME:
                startActivity(new Intent(this, MES4S6.class));
                break;
            case R.id.Subj7ME:
                startActivity(new Intent(this, MES4S7.class));
                break;
            case R.id.Subj8ME:
                startActivity(new Intent(this, MES4S8.class));
                break;
            case R.id.Subj9ME:
                startActivity(new Intent(this, MES4S9.class));
                break;


        */
    }

}
//}
