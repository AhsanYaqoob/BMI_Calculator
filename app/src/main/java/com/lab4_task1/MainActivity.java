package com.lab4_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.Button2);
        b2=findViewById(R.id.Button3);
        b3=findViewById(R.id.Button4);
        b4=findViewById(R.id.Button5);
        b5=findViewById(R.id.Button6);
        b6=findViewById(R.id.Button7);
        Intent i1=new Intent(MainActivity.this,BMI_Activity.class);
        Intent i2=new Intent(MainActivity.this,BMR_Activity.class);
        Intent i3=new Intent(MainActivity.this,BFP_Activity.class);
        Intent i4=new Intent(MainActivity.this,WHR_Activity.class);
        Intent i5=new Intent(MainActivity.this,TDE_Activity.class);
        Intent i6=new Intent(MainActivity.this,EER_Activity.class);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i6);
            }
        });
    }



}