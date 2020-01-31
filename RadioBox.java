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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
private RadioGroup radioGroup;
private RadioButton radioButton1,radioButton2;

private Button button,button2;
private TextView textView,textView2;

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
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button2 = (Button) findViewById(R.id.button2);
        textView2 = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroup.getCheckedRadioButtonId()==R.id.bit){
                    radioButton1 = (RadioButton) findViewById(R.id.bit);
                    String string1  = radioButton1.getText().toString();
                    textView2.setText("You will receive :"+string1);
                    Toast.makeText(MainActivity.this,"Welcome to receive BIT Degree",Toast.LENGTH_SHORT).show();

                }
                else{
                    radioButton2 = (RadioButton) findViewById(R.id.bsse);
                    String string2 = radioButton2.getText().toString();
                    textView2.setText("You will receive :"+string2);
                    Toast.makeText(MainActivity.this,"Welcome to receive BSSE Degree",Toast.LENGTH_SHORT).show();

                }



                StringBuilder stringBuilder = new StringBuilder();
                if(checkBox1.isChecked()){
                    String string = checkBox1.getText().toString();
                    stringBuilder.append(string+" is selected\n");
                    Toast.makeText(MainActivity.this,"Structured Programming",Toast.LENGTH_SHORT).show();
                }
                else  if(checkBox2.isChecked()){
                    String string = checkBox2.getText().toString();
                    stringBuilder.append(string+" is selected\n");
                    Toast.makeText(MainActivity.this,"Data Structure and Algorithm",Toast.LENGTH_SHORT).show();
                }
                    else  if(checkBox3.isChecked()){
                    String string = checkBox3.getText().toString();
                    stringBuilder.append(string+" is selected\n");
                    Toast.makeText(MainActivity.this,"Combinatorial Optimization",Toast.LENGTH_SHORT).show();
                }
                        else  if(checkBox4.isChecked()){
                    String string = checkBox4.getText().toString();
                    stringBuilder.append(string+" is selected\n");
                    Toast.makeText(MainActivity.this,"Design Pattern",Toast.LENGTH_SHORT).show();
                }
                    textView.setText(stringBuilder);
            }
        });
    }


}
