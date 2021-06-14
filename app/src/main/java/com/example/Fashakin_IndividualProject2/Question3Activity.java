package com.example.Fashakin_IndividualProject2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question3Activity extends Activity {

    private TextView q3Txt;
    private CheckBox a1, a2, a3, a4, a5;
    private String answer = "Hummingbird";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);

        a1 = (CheckBox) findViewById(R.id.q3a1);
        a2 = (CheckBox) findViewById(R.id.q3a2);
        a3 = (CheckBox) findViewById(R.id.q3a3);
        a4 = (CheckBox) findViewById(R.id.q3a4);

        q3Txt = (TextView) findViewById(R.id.q3) ;

        q3Txt.setText("Which animal does not appear in the Chinese zodiac?");

        a1.setText("Dragon");
        a2.setText("Rabbit");
        a3.setText("Dog");
        a4.setText("Hummingbird");


    }

    public void okHandler(View view) {
    }
}
