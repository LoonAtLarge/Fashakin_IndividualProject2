package com.example.Fashakin_IndividualProject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question1Activity extends AppCompatActivity {

    private TextView q1Txt;
    private CheckBox a1, a2, a3, a4, a5;
    private String answer = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        a1 = (CheckBox) findViewById(R.id.q1a1);
        a2 = (CheckBox) findViewById(R.id.q1a2);
        a3 = (CheckBox) findViewById(R.id.q1a3);
        a4 = (CheckBox) findViewById(R.id.q1a4);

        q1Txt = (TextView) findViewById(R.id.q1) ;

        q1Txt.setText("How many blue stripes are there on the U.S. flag?");

        a1.setText("6");
        a2.setText("7");
        a3.setText("13");
        a4.setText("0");



    }

    public void okHandler(View view) {
    }
}