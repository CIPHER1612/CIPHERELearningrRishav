
package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem6EC extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6_ec);
        findViewById(R.id.Subject1).setOnClickListener(this);
        findViewById(R.id.Subject2).setOnClickListener(this);
        findViewById(R.id.Subject3).setOnClickListener(this);
        findViewById(R.id.Subject4).setOnClickListener(this);
        findViewById(R.id.Subject5).setOnClickListener(this);
        findViewById(R.id.Subject6).setOnClickListener(this);
        findViewById(R.id.Subject7).setOnClickListener(this);
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
        switch (view.getId()) {
           /* case R.id.Subject1:
                startActivity(new Intent(this, ECS6S1.class));
                break;
            case R.id.Subject2:
                startActivity(new Intent(this, ECS6S2.class));
                break;
            case R.id.Subject3:
                startActivity(new Intent(this, ECS6S3.class));
                break;
            case R.id.Subject4:
                startActivity(new Intent(this, ECS6S4.class));
                break;
            case R.id.Subject5:
                startActivity(new Intent(this, ECS6S5.class));
                break;
            case R.id.Subject6:
                startActivity(new Intent(this, ECS6S6.class));
                break;
            case R.id.Subject7:
                startActivity(new Intent(this, ECS6S7.class));
                break;

        */
        }

    }
}
