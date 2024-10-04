package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userHeightFt, userHeightIn, userWeight;
        Button btnCalculator, btnShowData;
        TextView txtResult;

        userWeight = findViewById(R.id.user_weight);
        userHeightIn = findViewById(R.id.user_height_in);
        userHeightFt = findViewById(R.id.user_height_ft);
        btnCalculator = findViewById(R.id.calculator_btn);
        txtResult = findViewById(R.id.result);
        btnShowData = findViewById(R.id.show_data);

        btnCalculator.setOnClickListener(view -> {
            int wt = Integer.parseInt(userWeight.getText().toString());
            int hin = Integer.parseInt(userHeightIn.getText().toString());
            int hft = Integer.parseInt(userHeightFt.getText().toString());

            int totalIn = hft * 12 + hin;
            double totalCm = totalIn * 2.53;
            double totalM = totalCm / 100;
            double bmi = wt / (totalM * totalM);

            if (bmi > 25) {
                txtResult.setText("You are OverWeight!");
            } else if (bmi < 18) {
                txtResult.setText("You are UnderWeight!");
            } else {
                txtResult.setText("You are Healthy!");
            }
        });

        Intent iShow = new Intent(MainActivity.this, SecondActivity.class);
        iShow.putExtra("title", "Home");
        iShow.putExtra("user_name", "rahul sharma");
        iShow.putExtra("age", 22);

        btnShowData.setOnClickListener(view -> {
            Animation move = AnimationUtils.loadAnimation(this, R.anim.move);
            txtResult.startAnimation(move);
//            startActivity(iShow);
        });
    }
}