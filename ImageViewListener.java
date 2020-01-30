package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView){
            Toast.makeText(MainActivity.this,"Welcome to Hackathon",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.imageView2){
            Toast.makeText(MainActivity.this,"Welcome to Datathon",Toast.LENGTH_SHORT).show();
        }
    }
}
