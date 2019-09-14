package com.example.github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float a;
    EditText usd,bdt;
    Button b2,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void clickdollartotaka(View view)
    {
        usd= findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER); // numeric number show krbe
        bdt=findViewById(R.id.bdt);
        bdt.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollar=Integer.parseInt(usd.getText().toString());
        double result=dollar*84.50;
        bdt.setText(String.valueOf(result));
        b2= findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void clicktakatodollar(View view)
    {
        usd= findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        bdt= findViewById(R.id.bdt);
        bdt.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(bdt.getText().toString());
        double result=a/84.50;
        usd.setText(String.valueOf(result));

        b1=findViewById(R.id.submit);
        b1.setEnabled(false);
    }

    public void reset(View view)
    {
        b1= findViewById(R.id.submit);
        b1.setEnabled(true);
        b2= findViewById(R.id.submit2);
        b2.setEnabled(true);
        usd=  findViewById(R.id.usd);
        bdt= findViewById(R.id.bdt);
        usd.setText("");
        bdt.setText("");

    }


}