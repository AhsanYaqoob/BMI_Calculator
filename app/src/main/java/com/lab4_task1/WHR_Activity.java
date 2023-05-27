package com.lab4_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class WHR_Activity extends AppCompatActivity {

    EditText age, hip, waist;
    Button cal, clear;
    TextView result;
    RadioButton man, women;
    int manc, womenc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whr);
        age = findViewById(R.id.editTextNumber);
        hip = findViewById(R.id.editTextNumber2);
        waist = findViewById(R.id.editTextNumber3);
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
                 float h= Float.parseFloat(hip.getText().toString());
                 float w= Float.parseFloat(waist.getText().toString());

                 float ans=w/h;
                 result.setText(String.valueOf(ans));


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hip.setText("");
                age.setText("");
                waist.setText("");
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