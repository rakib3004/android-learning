package com.example.datathon;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;

private Button button;
private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        button =  (Button) findViewById(R.id.buttonl);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(checkBox1.isChecked()){
                    String string = checkBox1.getText().toString();
                    stringBuilder.append(string+" is selected");
                    Toast.makeText(MainActivity.this,"Structured Programming",Toast.LENGTH_SHORT).show();
                }
                else  if(checkBox2.isChecked()){
                    String string = checkBox2.getText().toString();
                    stringBuilder.append(string+" is selected");
                    Toast.makeText(MainActivity.this,"Data Structure and Algorithm",Toast.LENGTH_SHORT).show();
                }
                    else  if(checkBox3.isChecked()){
                    String string = checkBox3.getText().toString();
                    stringBuilder.append(string+" is selected");
                    Toast.makeText(MainActivity.this,"Combinatorial Optimization",Toast.LENGTH_SHORT).show();
                }
                        else  if(checkBox4.isChecked()){
                    String string = checkBox4.getText().toString();
                    stringBuilder.append(string+" is selected");
                    Toast.makeText(MainActivity.this,"Design Pattern",Toast.LENGTH_SHORT).show();
                }
                    textView.setText(stringBuilder);
            }
        });
    }


}
