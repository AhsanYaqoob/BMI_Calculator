package com.lab4_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class BFP_Activity extends AppCompatActivity {

    EditText age, weight, height;
    Button cal, clear;
    TextView result;
    RadioButton man, women;
    int manc, womenc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfp);
        age = findViewById(R.id.editTextNumber);
        height = findViewById(R.id.editTextNumber2);
        weight = findViewById(R.id.editTextNumber3);
        cal = findViewById(R.id.button);
        clear = findViewById(R.id.clear);
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
                float a = Float.parseFloat(String.valueOf(age.getText()));
                float h = Float.parseFloat(String.valueOf(height.getText()));
                float w = Float.parseFloat(String.valueOf(weight.getText()));

                if (manc == 1) {
                    double bmi,bfp;
                  bmi=a/(h*h);
                    bfp=(1.20*bmi)+(0.23+a)+(10.8*1)-5.4;
                    result.setText(String.valueOf(bfp));
                } else {
                    double bmi,bfp;
                    bmi=a/(h*h);
                    bfp=(1.20*bmi)+(0.23+a)+(10.8*0)-5.4;
                    result.setText(String.valueOf(bfp));
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
                manc = 0;
                womenc = 0;
                result.setText("Result");
            }
        });

    }
}