package com.example.gbapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et3;
    Button b,b2,b3,b4,b6;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et3 = (EditText) findViewById(R.id.et3);
        b = (Button) findViewById(R.id.b);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b6 = (Button) findViewById(R.id.b6);
        ans = (TextView) findViewById(R.id.ans);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int k = i + j;
                ans.setText("Ans is: " + k);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int m = i - j;
                ans.setText("Ans is: " + m);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int l = i * j;
                ans.setText("Ans is: " + l);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int d = i / j;
                ans.setText("Ans is: " + d);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}


    //public void add(View v){
        //int i=Integer.parseInt(et1.getText().toString());
        //int j=Integer.parseInt(et3.getText().toString());
        //int k=i+j;
       //ans.setText("Ans is: "+k);


