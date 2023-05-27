package com.lab4_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BMI_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        EditText ht;
        EditText ft;
        EditText inc;
        Button bts,reset;
        TextView res;
        LinearLayout plus;

        ht=findViewById(R.id.ht);
        ft=findViewById(R.id.ft);
        inc=findViewById(R.id.inc);
        bts=findViewById(R.id.btc);
        res=findViewById(R.id.res);
        plus=findViewById(R.id.plus);
        reset=findViewById(R.id.reset);
        bts.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {


                int t1=  Integer.parseInt(ht.getText().toString());
                int t2=  Integer.parseInt( ft.getText().toString());
                int t3=  Integer.parseInt( inc.getText().toString());

                int ttlin=t2*12+t3;
                double totalcm=ttlin*2.53;
                double totalm=totalcm/100;

                double bmi=t1/(totalm*totalm);

                if (bmi>25){
                    res.setText("You are overweight");
                    plus.setBackgroundColor(getResources().getColor(R.color.red));
                }
                else if (bmi<18){
                    res.setText("You are underweight");
                    plus.setBackgroundColor(getResources().getColor(R.color.red));

                }
                else {
                    res.setText("You are Healthy");
                    plus.setBackgroundColor(getResources().getColor(R.color.green));
                }


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ht.setText("");
                ft.setText("");
                inc.setText("");
                plus.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
    }
}