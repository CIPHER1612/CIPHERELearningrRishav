package com.example.sammy.ciphere_learning;

import android.*;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.util.HashMap;
import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;

public class Regsetup extends AppCompatActivity {
    private CircleImageView regimage;
    private Uri mainImageURI = null;
    private EditText Name,Deptid;
    private Button Next_setup;
    private StorageReference storageReference;
    private FirebaseAuth firebaseAuth;
    private ProgressBar setupProgress;
    private FirebaseFirestore Fstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityCompat.requestPermissions(Regsetup.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        super.onCreate(savedInstanceState);
        Fstore=FirebaseFirestore.getInstance();
        setContentView(R.layout.activity_regsetup);
        firebaseAuth = FirebaseAuth.getInstance();
        storageReference= FirebaseStorage.getInstance().getReference();

        regimage = findViewById(R.id.circleimage);
        Name = findViewById(R.id.editTextSetup);
        Deptid = findViewById(R.id.editTextDeptsetup);
        Next_setup = findViewById(R.id.Setup_next);
        setupProgress = findViewById(R.id.setup_progress);



        Next_setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String fullname = Name.getText().toString();
                    String dept = Deptid.getText().toString();

                if (TextUtils.isEmpty(fullname) && mainImageURI == null) {
                    Toast.makeText(Regsetup.this, "Please upload your photo", Toast.LENGTH_LONG).show();
                } else {
                        String usid = firebaseAuth.getCurrentUser().getUid();
                        Map<String,String> userMap = new HashMap<>();
                        userMap.put("Name",fullname);
                        userMap.put("Deptid",dept);
                        Fstore.collection("Users").document(usid).set(userMap);
                        setupProgress.setVisibility(View.VISIBLE);
                        StorageReference image_path=storageReference.child("Profile_images").child(usid+".jpg");
                        image_path.putFile(mainImageURI).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                                if (task.isSuccessful()){
                                    Uri download_uri= task.getResult().getDownloadUrl();
                                    Intent intent=new Intent(Regsetup.this,MainActivity.class);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    startActivity(intent);

                                }else{
                                    String error=task.getException().getMessage();
                                    Toast.makeText(Regsetup.this,"Error"+error,Toast.LENGTH_LONG).show();
                                }
                                setupProgress.setVisibility(View.INVISIBLE);

                            }
                        });



                    }
            }
        });




        regimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M)
                {
                    if (ContextCompat.checkSelfPermission(Regsetup.this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED) {

                        ActivityCompat.requestPermissions(Regsetup.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
                    } else {
                        CropImage.activity()
                                .setGuidelines(CropImageView.Guidelines.ON)
                                .setAspectRatio(1,1)
                                .start(Regsetup.this);


                    }
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                mainImageURI = result.getUri();
                regimage.setImageURI(mainImageURI);


            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Exception error = result.getError();
            }
    }
}}
