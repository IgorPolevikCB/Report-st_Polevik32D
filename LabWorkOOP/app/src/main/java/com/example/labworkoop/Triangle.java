package com.example.labworkoop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }


    public void Perimeter(View v) {

        //getting strings from input text field
        EditText triangleSide1 = (EditText) findViewById(R.id.input);
        String SideA = triangleSide1.getText().toString();

        EditText triangleSide2 = (EditText) findViewById(R.id.input1);
        String SideB = triangleSide2.getText().toString();

        EditText triangleSide3 = (EditText) findViewById(R.id.input2);
        String SideC = triangleSide3.getText().toString();

        //converting strings to float for calculating
        float A = Float.parseFloat(SideA);
        float B = Float.parseFloat(SideB);
        float C = Float.parseFloat(SideC);
        float result;
        result = A + B + C;

        // 2 digits after ","
        String perimeter = String.format("%.2f",result);

        //Setting received value in textView
        TextView text = (TextView) findViewById(R.id.textView10);
        text.setText("Ответ: " + perimeter);

    }

    public void SquareHeron(View v) {
        //Getting strings from input text field
        EditText triangleSide1 = (EditText) findViewById(R.id.input);
        String SideA = triangleSide1.getText().toString();

        EditText triangleSide2 = (EditText) findViewById(R.id.input1);
        String SideB = triangleSide2.getText().toString();

        EditText triangleSide3 = (EditText) findViewById(R.id.input2);
        String SideC = triangleSide3.getText().toString();

        //Converting strings to float for calculating
        float A = Float.parseFloat(SideA);
        float B = Float.parseFloat(SideB);
        float C = Float.parseFloat(SideC);
        float result;


        float P;
        float h;


        //Calculating semi perimeter
        P = (0.5f * (A + B + C));
        

        // 2 digits after ","
        String SemiPerimeter = String.format("%.2f", P);



        //Calculating area by Heron's formula
        h = (float) Math.sqrt(P * (P - A) * (P - B) * (P - C));

        //Initializing variable of area and calculating her
        Float S;
        S = 0.5f * A * h;
        
        // 2 digits after ","
        String alt = String.format("%.2f", h);

        //Setting received value of triangle alt in textView10
        TextView text = (TextView) findViewById(R.id.textView10);
        text.setText("Высота: " + alt);
        
        // 2 digits after ","
        String area = String.format("%.2f", S);

        //Setting received value of triangle area in textView12
        TextView text1 = (TextView) findViewById(R.id.textView12);
        text1.setText("Площадь: " + area);

    }
    }