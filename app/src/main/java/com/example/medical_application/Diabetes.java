package com.example.medical_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Diabetes extends AppCompatActivity {
    ImageButton iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);
        iv=findViewById(R.id.arrow_img);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(Diabetes.this ,first_aid_lv.class);
                startActivity(b);
            }
        });
    }
}