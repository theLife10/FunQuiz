package com.fun.android.funquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    private Question [] mQuestionBank = new Question[] {
            new Question(R.string.chuy_car,false),
            new Question(R.string.chuy_dog,true),
            new Question(R.string.chuy_pizza,false),
            new Question(R.string.chuy_computer,true),
            new Question(R.string.chuy_coffee,true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton =(Button) findViewById(R.id.false_button);

        //True button listener
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.correct_toast,Toast.LENGTH_SHORT)
                .show();
            }
        });

        //False button listener
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.false_toast,Toast.LENGTH_SHORT)
                .show();
            }
        });
    }
}
