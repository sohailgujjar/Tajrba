package com.example.ftc.tajrba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.sohaillibrary.calculate;

public class MainActivity extends AppCompatActivity {
    TextView setText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setText = findViewById(R.id.textview);
        setText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.add(6, 10);
                int ans = calculate.minus(10,15);
              //  Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
                setText.setText(String.valueOf(ans));
            }
        });

    }



}