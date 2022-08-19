package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {" 1-NIT Hamirpur came into existence on 7th August 1986 ?", "2-At the time of inception, Institute had only two departments i.e, Computer Science and Electical Engineering ?", "3-NITH  Campus is spread across 320 acres ?",
            "4-Prof. Lalit Kumar Awasthi is current director of NITH ?", "5-The institute campus is situated in Hamirpur district of Himachal Pradesh, India, at an altitude of 900 meters above sea level ?",
            "6-The distance to campus from main bus termius of Hamirpur city is approximately 10 km ?", "7-The nearest situated airport at 86.9km ?", "8-Himgiri is girl's Hostel ?", "9-There is 13 departments in NIT Hamirpur ? "  };
    private boolean[] answers = {true, false, true, false, true, false, true, false, true };
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if array is not going out of bound
                if(index <= questions.length-1){
                    // if you have given correct answer
                    if(answers[index] == true){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             // if array is not going out of bound
             if(index <= questions.length-1){
                 // if you have given correct answer
                 if(answers[index] == false){
                     score++;
                 }
                 index++;
                 if(index <= questions.length-1){
                     question.setText(questions[index]);
                 }
                 else{
                     Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
                 }
             }
             else{
                 Toast.makeText(MainActivity.this, "Restart the app to play again ", Toast.LENGTH_SHORT).show();
             }
            }
        });
    }
}