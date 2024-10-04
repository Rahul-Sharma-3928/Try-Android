package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent iShowData = getIntent();

        String title = iShowData.getStringExtra("title");
        String userName = iShowData.getStringExtra("user_name");
        int age = iShowData.getIntExtra("age", 0);

        TextView tName, tAge;
        tName = findViewById(R.id.user_name);
        tAge = findViewById(R.id.user_age);


        tName.setText("Name: " + userName);
        tAge.setText("Age: " + age);
        getSupportActionBar().setTitle(title);

        Log.d("check", "check my error in android studio.");
    }
}