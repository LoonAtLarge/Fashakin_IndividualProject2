package com.example.Fashakin_IndividualProject2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class GameActivity extends AppCompatActivity {

    private Button rulesBtn, backBtn, q1Btn, q2Btn, q3Btn, q4Btn, q5Btn, submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rulesBtn = (Button) findViewById(R.id.ruleBtn);
        backBtn = (Button) findViewById(R.id.backBtn);
        submitBtn = (Button) findViewById(R.id.submitBtn);

        //----------------------------------------------------------------------------------------
        q1Btn = (Button) findViewById(R.id.q1Btn);
        q2Btn = (Button) findViewById(R.id.q2Btn);
        q3Btn = (Button) findViewById(R.id.q3Btn);
        q4Btn = (Button) findViewById(R.id.q4Btn);
        q5Btn = (Button) findViewById(R.id.q5Btn);



    }

    public void backHandler(View view) {

        startActivity(new Intent(GameActivity.this, HomeActivity.class));
        finish();

    }

    public void q1Handler(View view) {
        final Dialog question = new Dialog(GameActivity.this, android.R.style.Theme_Black_NoTitleBar);
        question.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        question.setContentView(R.layout.question1);
        question.setCancelable(true);
        question.show();
    }

    public void q2Handler(View view) {
        final Dialog question = new Dialog(GameActivity.this, android.R.style.Theme_Black_NoTitleBar);
        question.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        question.setContentView(R.layout.question2);
        question.setCancelable(true);
        question.show();
    }

    public void q3Handler(View view) {
        final Dialog question = new Dialog(GameActivity.this, android.R.style.Theme_Black_NoTitleBar);
        question.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        question.setContentView(R.layout.question3);
        question.setCancelable(true);
        question.show();
    }

    public void q4Handler(View view) {
        final Dialog question = new Dialog(GameActivity.this, android.R.style.Theme_Black_NoTitleBar);
        question.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        question.setContentView(R.layout.question4);
        question.setCancelable(true);
        question.show();
    }

    public void q5Handler(View view) {
        final Dialog question = new Dialog(GameActivity.this, android.R.style.Theme_Black_NoTitleBar);
        question.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        question.setContentView(R.layout.question5);
        question.setCancelable(true);
        question.show();
    }

    public void submitHandler(View view) {

    }

    public void okHandler(View view) {
        //finish();
    }

    public void rulesHandler(View view) {
        final Dialog rules = new Dialog(GameActivity.this, android.R.style.Theme_Black_NoTitleBar);
        rules.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        rules.setContentView(R.layout.activity_rules);
        rules.setCancelable(true);
        rules.show();
    }
}