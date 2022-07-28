package com.example.ar_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class Form extends AppCompatActivity {
    TextInputLayout t1,t2,t3;
    Button b1;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        t1 = (TextInputLayout)findViewById(R.id.t1);
        t2 = (TextInputLayout)findViewById(R.id.t2);
        t3 = (TextInputLayout)findViewById(R.id.t3);
        mAuth = FirebaseAuth.getInstance();
        b1 = findViewById(R.id.button);
    }


}