package com.innovativehackers.myapp1;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registerpage extends AppCompatActivity {
    private TextView exUser;
    private EditText email, userName, userPass, conUserPass;
    private Button regBtn;
    private FirebaseAuth auth;
    private String emailStr="",passStr="",userNameStr="",confPassStr="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        exUser = findViewById(R.id.exUser);
        email = findViewById(R.id.userEmail);
        userName = findViewById(R.id.userFullName);
        userPass = findViewById(R.id.userPass);
        conUserPass = findViewById(R.id.conUserPassword);
        regBtn = findViewById(R.id.regBt);
        auth = FirebaseAuth.getInstance();
        exUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registerpage.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailStr = email.getText().toString();
                passStr = userPass.getText().toString();
                confPassStr = conUserPass.getText().toString();
                if(emailStr.isEmpty()||passStr.isEmpty()||confPassStr.isEmpty()){
                    Toast.makeText(registerpage.this, "All fields are required!", Toast.LENGTH_SHORT).show();
                }else if(!passStr.equals(confPassStr)){
                    Toast.makeText(registerpage.this, "Passwords didn't match!", Toast.LENGTH_SHORT).show();
                }else if(passStr.length()<=8){
                    Toast.makeText(registerpage.this, "Password is too short", Toast.LENGTH_SHORT).show();
                }else{
                    auth.createUserWithEmailAndPassword(emailStr,passStr).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Toast.makeText(registerpage.this, "Registration succesful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(registerpage.this,Login.class);
                            startActivity(intent);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(registerpage.this, "Registration failed", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });

    }
}