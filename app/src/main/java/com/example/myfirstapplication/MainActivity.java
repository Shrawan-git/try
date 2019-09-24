package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Number_1;
    private EditText Number_2;
    private TextView Result;
    private Button Btn_add;
    private Button Btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number_1 = findViewById(R.id.number_1);
        Number_2 = findViewById(R.id.number_2);
        Btn_add = findViewById(R.id.btn_add);
        Btn_sub = findViewById(R.id.btn_sub);

        Btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Number_1.getText().toString().length() == 0){
                    Number_1.setText("0");
                }
                if(Number_2.getText().toString().length() == 0){
                    Number_2.setText("0");
                }

                int num1 = Integer.parseInt(Number_1.getText().toString());
                int num2 = Integer.parseInt(Number_2.getText().toString());

                int sum = num1 + num2;
                Toast.makeText(MainActivity.this, "The sum is" + sum , Toast.LENGTH_SHORT).show();

            }
        });

        Btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Number_1.getText().toString());
                int num2 = Integer.parseInt(Number_2.getText().toString());

                int sub = num1 - num2;
                Toast.makeText(MainActivity.this, "The subtraction is" + sub, Toast.LENGTH_SHORT).show();



            }
        });

    }
}
