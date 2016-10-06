package com.sunshine.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView firstTextView= (TextView) findViewById(R.id.textView);
        Button firstButton= (Button) findViewById(R.id.firstButton);
        if (firstButton != null) {
            firstButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    firstTextView.setText("It works! again");
                }
            });
        }


    }
}
