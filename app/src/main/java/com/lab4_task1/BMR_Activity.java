package com.lab4_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class BMR_Activity extends AppCompatActivity {
    EditText age, weight, height;
    Button cal,clear;
    TextView result;
    RadioButton man, women;
    int manc, womenc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);


        age = findViewById(R.id.editTextNumber);
        height = findViewById(R.id.editTextNumber2);
        weight = findViewById(R.id.editTextNumber3);
        cal = findViewById(R.id.button);
        clear=findViewById(R.id.clear);
        result = findViewById(R.id.result);
        man = findViewById(R.id.radioButton);
        women = findViewById(R.id.radioButton2);
        manc = 0;
        womenc = 0;



        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (manc == 0) {
                    manc = 1;
                    women.setEnabled(false);
                } else if (manc == 1) {
                    manc = 0;
                    women.setEnabled(true);
                    man.setChecked(false);
                }

            }
        });
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (womenc == 0) {
                    womenc = 1;
                    man.setEnabled(false);
                } else if (womenc == 1) {
                    womenc = 0;
                    man.setEnabled(true);
                    women.setChecked(false);
                }
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               float a= Float.parseFloat(String.valueOf(age.getText()));
                float h =Float.parseFloat(String.valueOf(height.getText()));
                float w = Float.parseFloat(String.valueOf(weight.getText()));
                if (manc == 1) {
                    double bmr;
                    bmr = 88.362 + (13.397 * w) + (4.799 * h) - (5.677 * a);
                    result.setText(String.valueOf(bmr));
                } else {
                    double bmr;
                    bmr = 447.593 + (9.247 * w) + (3.098 * h) - (4.330 * a);
                    result.setText(String.valueOf(bmr));
                }

            }




        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height.setText("");
                age.setText("");
                weight.setText("");
                man.setChecked(false);
                women.setChecked(false);
                man.setEnabled(true);
                women.setEnabled(true);
                manc=0;
                womenc=0;
                result.setText("Result");
            }
        });

    }


}