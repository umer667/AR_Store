package com.example.ar_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Categories extends AppCompatActivity {
    ImageView image1, image2, image3, image4, image5, image6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories2);
        image1 = findViewById(R.id.img1);
        image2 = findViewById(R.id.img2);
        image3 = findViewById(R.id.img3);
        image4 = findViewById(R.id.img4);
        image5 = findViewById(R.id.img5);
        image6 = findViewById(R.id.img6);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Categories.this, Form.class));
            }
        });
    }
}