package com.example.ar_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText uEmail, uPassword;
    FirebaseAuth mAuth;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uEmail = findViewById(R.id.email);
        uPassword = findViewById(R.id.password);
        btn = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();


        //mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener< AuthResult >() {
           /// @Override
         //   public void onComplete(@NonNull Task< AuthResult > task) {
          //      if (task.isSuccessful()){
          //          Toast.makeText(Login.this, "Logged in Successful", Toast.LENGTH_SHORT).show();
           //         startActivity(new Intent(getApplicationContext(), MainActivity.class));
               // }
            }
      //  });
   // }
}