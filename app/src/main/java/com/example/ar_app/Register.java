package com.example.ar_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText uname, uemail, pasword, uaddress;
    Button regbutton;
    TextView loginbtn;
    FirebaseAuth fAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        uname = findViewById(R.id.name);
        uemail = findViewById(R.id.email);
        pasword = findViewById(R.id.password);
        uaddress = findViewById(R.id.Address);
        regbutton = findViewById(R.id.button);
        loginbtn =findViewById(R.id.login);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);
        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = uname.getText().toString().trim();
                String Address = uaddress.getText().toString().trim();
                String email = uemail.getText().toString().trim();
                String password = pasword.getText().toString().trim();
                if (TextUtils.isEmpty(email)){
                    uemail.setError("Email is Compulsory! Please Enter Email");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    pasword.setError("Please Enter a Password");
                    return;
                }
                if(password.length() < 6){
                    pasword.setError("Password must be of 6 or more characters");
                    return;
                }
                progressBar.setVisibility(view.VISIBLE);
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener< AuthResult >() {
                    @Override
                    public void onComplete(@NonNull Task< AuthResult > task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Register.this, "User Created!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Login.class));
                        }
                        else{
                            Toast.makeText(Register.this, "Error...." + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });
    }
}