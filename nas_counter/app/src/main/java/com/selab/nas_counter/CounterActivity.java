package com.selab.nas_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    int number=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        TextView numberShow=(TextView) findViewById(R.id.number);
        numberShow.setText("The current number is: "+number);
        Button AddClick=(Button) findViewById(R.id.add);
        AddClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                number++;
                numberShow.setText("The current number is: "+number);
            }
        });

        Button ReduceClick=(Button) findViewById(R.id.reduce);
        ReduceClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                number--;
                numberShow.setText("The current number is: "+number);
            }
        });

        Button ClearClick=(Button) findViewById(R.id.clear);
        ClearClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                number=0;
                numberShow.setText("The current number is: "+number);
            }
        });
    }
}