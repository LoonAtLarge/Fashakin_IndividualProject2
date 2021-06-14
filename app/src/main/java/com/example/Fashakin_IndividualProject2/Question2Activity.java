package com.example.Fashakin_IndividualProject2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;


public class Question2Activity extends Activity {

    private TextView q2Txt;
    private CheckBox a1, a2, a3, a4, a5;
    private String answer = "Draco Malfoy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);

        a1 = (CheckBox) findViewById(R.id.q3a1);
        a2 = (CheckBox) findViewById(R.id.q3a2);
        a3 = (CheckBox) findViewById(R.id.q3a3);
        a4 = (CheckBox) findViewById(R.id.q3a4);

        q2Txt = (TextView) findViewById(R.id.q2) ;

        q2Txt.setText("Which one of these characters is not friends with Harry Potter?");

        a1.setText("Ron Weasley");
        a2.setText("Neville Longbottom");
        a3.setText("Draco Malfoy");
        a4.setText("Hermione Granger");
    }
}
