package com.example.Fashakin_IndividualProject2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question5Activity extends Activity {

    private TextView q5Txt;
    private CheckBox a1, a2, a3, a4, a5;
    private String answer = "The Black Pearl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);

        a1 = (CheckBox) findViewById(R.id.q5a1);
        a2 = (CheckBox) findViewById(R.id.q5a2);
        a3 = (CheckBox) findViewById(R.id.q5a3);
        a4 = (CheckBox) findViewById(R.id.q5a4);

        q5Txt = (TextView) findViewById(R.id.q5) ;

        q5Txt.setText("In Pirates of the Caribbean, what was the name of Captain Jack Sparrow’s ship?");

        a1.setText("The Marauder");
        a2.setText("The Black Pearl");
        a3.setText("The Black Python");
        a4.setText("The Slytherin");
    }
}
