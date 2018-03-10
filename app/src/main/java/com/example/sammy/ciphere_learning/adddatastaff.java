package com.example.sammy.ciphere_learning;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.nbsp.materialfilepicker.MaterialFilePicker;
import com.nbsp.materialfilepicker.ui.FilePickerActivity;

public class adddatastaff extends AppCompatActivity {
    private StorageReference mStorageRef;
    private FirebaseFirestore firebaseFirestore;
    Button button,button2;
    TextView textView;
    EditText medit;
    String jeneke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddatastaff);
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1001);
        }
        mStorageRef = FirebaseStorage.getInstance().getReference();
        firebaseFirestore=FirebaseFirestore.getInstance();
        button = (Button) findViewById(R.id.SELF);
        button2 = (Button) findViewById(R.id.UPLOAD);
        textView = (TextView) findViewById(R.id.addview);
        medit = (EditText) findViewById(R.id.fag);
        StorageReference filePath = mStorageRef.child("VECTORS");



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialFilePicker()
                        .withActivity(adddatastaff.this)
                        .withRequestCode(1000)
                        .withHiddenFiles(true) // Show hidden files and folders
                        .start();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bomb = medit.getText().toString();
                textView.setText(bomb);


            }
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //String bomb = medit.getText().toString();
        //textView.setText(bomb);


        if (requestCode == 1000 && resultCode == RESULT_OK) {
            jeneke = data.getStringExtra(FilePickerActivity.RESULT_FILE_PATH);
            //Toast toast = Toast.makeText(this, filePath, Toast.LENGTH_LONG);
            textView.setText(jeneke);



        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1001:{
                if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this,"Permission FAILED",Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        }

    }
}


