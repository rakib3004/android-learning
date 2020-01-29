package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity/* implements View.OnClickListener */{
    private Button button,button1;
  private TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        textView = (TextView)findViewById(R.id.textDemo);
         textView1 = (TextView)findViewById(R.id.textDemo1);

     //   button.setOnClickListener(this);
      //  button1.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textView.setText("Private Network");
                textView1.setText("Department of Software Engineering");
            }
        });

     button1.setOnClickListener(new  View.OnClickListener(){
         public void onClick(View v){
             textView.setText("Public Network");
             textView1.setText("University of Dhaka");
         }
     });

    }

 /*   @Override
    public void onClick(View v) {
    }*/
}
