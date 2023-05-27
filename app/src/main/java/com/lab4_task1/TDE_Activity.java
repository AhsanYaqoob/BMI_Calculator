package com.lab4_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TDE_Activity extends AppCompatActivity {

    EditText age, weight, height;
    Button cal,clear;
    TextView result;
    RadioButton light,moderat,extreme,man,woman;
    int lightc,moderatc,extremec,manc,womanc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tde);


        age = findViewById(R.id.editTextNumber);
        height = findViewById(R.id.editTextNumber2);
        weight = findViewById(R.id.editTextNumber3);
        cal = findViewById(R.id.button2);
        clear=findViewById(R.id.clear);
        result = findViewById(R.id.result);

        man = findViewById(R.id.radioButton);
        woman = findViewById(R.id.radioButton2);
        light = findViewById(R.id.radioButton3);
        moderat = findViewById(R.id.radioButton4);
        extreme = findViewById(R.id.radioButton5);

        lightc = 0;
        moderatc = 0;
        extremec = 0;
        manc = 0;
        womanc = 0;


        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (manc == 0) {
                    manc = 1;
                    woman.setEnabled(false);
                } else if (manc == 1) {
                    manc = 0;
                    woman.setEnabled(true);
                    man.setChecked(false);
                }

            }
        });
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (womanc == 0) {
                    womanc = 1;
                    man.setEnabled(false);
                } else if (womanc == 1) {
                    womanc = 0;
                    man.setEnabled(true);
                    woman.setChecked(false);
                }
            }
        });



        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lightc == 0) {
                    lightc = 1;
                    moderat.setEnabled(false);
                    extreme.setEnabled(false);

                } else if (lightc == 1) {
                    lightc = 0;
                    light.setChecked(false);
                    moderat.setEnabled(true);
                    extreme.setEnabled(true);

                }

            }
        });
        moderat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (moderatc == 0) {
                    moderatc = 1;
                    light.setEnabled(false);
                    extreme.setEnabled(false);

                } else if (moderatc == 1) {
                    moderatc = 0;
                    moderat.setChecked(false);
                    light.setEnabled(true);
                    extreme.setEnabled(true);
                }
            }
        });

        extreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (extremec == 0) {
                    extremec = 1;
                    light.setEnabled(false);
                    moderat.setEnabled(false);

                } else if (extremec == 1) {
                    extremec = 0;
                    extreme.setChecked(false);
                    light.setEnabled(true);
                    moderat.setEnabled(true);
                }
            }
        });


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a= Float.parseFloat(String.valueOf(age.getText()));
                float h =Float.parseFloat(String.valueOf(height.getText()));
                float w = Float.parseFloat(String.valueOf(weight.getText()));
                if(lightc==1){
                if (manc == 1) {
                    double bmr;
                    bmr = 88.362 + (13.397 * w) + (4.799 * h) - ((5.677 * a)*(1.2));
                    result.setText(String.valueOf(bmr));
                } else {
                    double bmr;
                    bmr = 447.593 + (9.247 * w) + (3.098 * h) - ((4.330 * a)*(1.2));
                    result.setText(String.valueOf(bmr));
                }}
                else if(moderatc==1){
                    if (manc == 1) {
                        double bmr;
                        bmr = 88.362 + (13.397 * w) + (4.799 * h) - ((5.677 * a)*(1.55));
                        result.setText(String.valueOf(bmr));
                    } else {
                        double bmr;
                        bmr = 447.593 + (9.247 * w) + (3.098 * h) - ((4.330 * a)*(1.55));
                        result.setText(String.valueOf(bmr));
                    }}
                else if(extremec==1){
                    if (manc == 1) {
                        double bmr;
                        bmr = 88.362 + (13.397 * w) + (4.799 * h) - ((5.677 * a)*(1.9));
                        result.setText(String.valueOf(bmr));
                    } else {
                        double bmr;
                        bmr = 447.593 + (9.247 * w) + (3.098 * h) - ((4.330 * a)*(1.9));
                        result.setText(String.valueOf(bmr));
                    }}


            }

        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height.setText("");
                age.setText("");
                weight.setText("");
                man.setChecked(false);
                woman.setChecked(false);
                man.setEnabled(true);
                woman.setEnabled(true);
                manc=0;
                womanc=0;
                light.setChecked(false);
                light.setEnabled(true);
                moderat.setEnabled(true);
                moderat.setChecked(false);
                extreme.setEnabled(true);
                extreme.setChecked(false);
                result.setText("Result");
            }
        });

    }
}