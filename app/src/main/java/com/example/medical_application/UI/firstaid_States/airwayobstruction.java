package com.example.medical_application.UI.firstaid_States;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.medical_application.R;

public class airwayobstruction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airwayobstruction);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView =findViewById(R.id.textview);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}