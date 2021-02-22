package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Scriptable;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private TextView tvInput, tvOutput;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button0, buttonMinus, buttonPlus, buttonEquals, buttonClear;
    String process;
    double num1 = Double.NaN, num2;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char EQUALS = '=';
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "+");
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "-");
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                process = process.replaceAll("×","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");

                Context rhino ;

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    finalResult="0";
                }

                tvOutput.setText(finalResult);
            }
        });
    }
    private void compute() {
        if(!Double.isNaN(num1)) {
            switch (ACTION) {
                case ADDITION:

            }
        }
    }

    private void findViews() {
        tvInput = findViewById(R.id.text_view1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);
        tvOutput = findViewById(R.id.text_view2);
    }
}