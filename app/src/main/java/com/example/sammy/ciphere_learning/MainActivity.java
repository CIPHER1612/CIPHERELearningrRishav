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
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextEmail, editTextPassword,editTextRegNo;
    String cs="cs";
    String ec="ec";
    String ee="ee";
    String adft="adft";
    String ce="ce";
    String me="me";
    String ok;
    private FirebaseAuth mAuth;
    private FirebaseFirestore Fstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Fstore=FirebaseFirestore.getInstance();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail = findViewById(R.id.editTextEmailreg2);
        editTextPassword = findViewById(R.id.editTextPasswordreg2);

        findViewById(R.id.regButton).setOnClickListener(this);
        findViewById(R.id.LogButton).setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.regButton:
                startActivity(new Intent(this, RegActivity.class));
                break;
            case R.id.LogButton:
                userlogin();

                break;
        }
    }

    private void userlogin() {
        String email=editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();

        if(email.isEmpty()){
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }


        if(password.length()<6){
            editTextPassword.setError(("Minimum length of password is 6 characters"));
            editTextPassword.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;
        }
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                String usid = mAuth.getCurrentUser().getUid();

                Fstore.collection("Users").document(usid).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()){
                            DocumentSnapshot documentSnapshot=task.getResult();
                            String depid = documentSnapshot.getString("Deptid").toLowerCase();
                            if(depid.matches(cs)) {
                                Intent intent=new Intent(MainActivity.this,CShome.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);

                            }else

                            if (depid.matches(me)) {
                                Intent intent=new Intent(MainActivity.this,Mechhome.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);

                            }
                            else

                            if (depid.matches(ce)) {
                                Intent intent=new Intent(MainActivity.this,CEhome.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);

                            }
                        }
                    }
                });

                 /*else{
                    Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
}