package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_sum, btn_FtoC, btn_CtoF, btn_si;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn_sum = findViewById(R.id.btn_sum);
        btn_FtoC = findViewById(R.id.btn_FtoC);
        btn_CtoF = findViewById(R.id.btn_CtoF);
        btn_si = findViewById(R.id.btn_si);

        btn_sum.setOnClickListener(this);
        btn_FtoC.setOnClickListener(this);
        btn_CtoF.setOnClickListener(this);
        btn_si.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_sum) {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_FtoC) {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_CtoF) {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }

}

