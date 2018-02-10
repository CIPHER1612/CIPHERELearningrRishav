package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegActivity extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth mAuth;
    EditText editTextEmailreg, editTextPasswordreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        editTextEmailreg=(EditText) findViewById(R.id.editTextEmailreg);
        editTextPasswordreg=(EditText) findViewById(R.id.editTextPasswordreg);
        findViewById(R.id.SignButton).setOnClickListener(this);
        findViewById(R.id.LogBackButton).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.SignButton:
                register();
                break;
            case R.id.LogBackButton:
                startActivity(new Intent(this, MainActivity.class));
                break;


        }

    }

    private void register() {
        String email=editTextEmailreg.getText().toString().trim();
        String password=editTextPasswordreg.getText().toString().trim();

        if(email.isEmpty()){
            editTextEmailreg.setError("Email is required");
            editTextEmailreg.requestFocus();
            return;
        }


        if(password.length()<6){
            editTextPasswordreg.setError(("Minimum length of password is 6 characters"));
            editTextPasswordreg.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPasswordreg.setError("Password is required");
            editTextPasswordreg.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent=new Intent(RegActivity.this,Regsetup.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }

                        // ...
                    }
                });

    }
}
