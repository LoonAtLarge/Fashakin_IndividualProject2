package com.example.Fashakin_IndividualProject2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question4Activity extends Activity {

    private TextView q4Txt;
    private CheckBox a1, a2, a3, a4, a5;
    private String answer = "Philadelphia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);

        a1 = (CheckBox) findViewById(R.id.q4a1);
        a2 = (CheckBox) findViewById(R.id.q4a2);
        a3 = (CheckBox) findViewById(R.id.q4a3);
        a4 = (CheckBox) findViewById(R.id.q4a4);

        q4Txt = (TextView) findViewById(R.id.q4) ;

        q4Txt.setText("In which city can you find the Liberty Bell?");

        a1.setText("Washington, D.C.");
        a2.setText("Boston");
        a3.setText("Philadelphia");
        a4.setText("Manhattan ");
    }

    public void okHandler(View view) {
    }
}
