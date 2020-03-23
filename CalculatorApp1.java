package com.example.calculatorsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;

    private TextView textView;
    private TextView textView2;

    private final char ADD = '+';
    private final char SUB = '-';
    private final char MUL = '*';
    private final char DIV = '/';
    private final char MOD = '%';
    private final char EQUAL = 0;

    private char operator;

    private double var1 = Double.NaN;
    private double var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionMethods();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"1");
            }
        });
         button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"2");
            }
        });
         button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"3");
            }
        });
         button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"4");
            }
        });
          button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"5");
            }
        });
         button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"6");
            }
        });
         button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"7");
            }
        });
         button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"8");
            }
        });
          button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"9");
            }
        });
         button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText().toString()+"0");
            }
        });
         button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compare();
                operator = MOD;
                textView2.setText(String.valueOf(var1)+ "%");
                textView.setText(null);
            }
        });
         button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        compare();
        operator  =EQUAL;
        textView.setText(textView.getText().toString() + String.valueOf(var1)+"="+String.valueOf(var2));
        textView2.setText(null);

            }
        });
          button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compare();
                operator = ADD;
                textView2.setText(String.valueOf(var1)+ "+");
        textView.setText(null);

            }
        });
         button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compare();
                operator = SUB;
                textView2.setText(String.valueOf(var1)+ "-");
                textView.setText(null);            }
        });
         button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compare();
                operator = MUL;
                textView2.setText(String.valueOf(var1)+ "*");
                textView.setText(null);            }
        });
         button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compare();
                operator = DIV;

                textView2.setText(String.valueOf(var1)+ "/");

                textView.setText(null);


            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              try{
                  String string = textView2.getText().toString();
                  int n = string.length();
                  string = string.substring(0,n-2);

                  textView2.setText(string);
              }
              catch (Exception exception){

            var1 = Double.NaN;
              var2 = Double.NaN;
              textView.setText(null);
              textView2.setText(null);
              }

            }
        });
         button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("");
            }
        });
         button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("");
            }
        });
         button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit(0);
            }
        });


    }

    private void actionMethods(){

        button =(Button)findViewById(R.id.button);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.button5);
        button6 =(Button)findViewById(R.id.button6);
        button7 =(Button)findViewById(R.id.button7);
        button8 =(Button)findViewById(R.id.button8);
        button9 =(Button)findViewById(R.id.button9);
        button10 =(Button)findViewById(R.id.button10);
        button11 =(Button)findViewById(R.id.button11);
        button12 =(Button)findViewById(R.id.button12);
        button13 =(Button)findViewById(R.id.button13);
        button14 =(Button)findViewById(R.id.button14);
        button15 =(Button)findViewById(R.id.button15);
        button16 =(Button)findViewById(R.id.button16);
        button17 =(Button)findViewById(R.id.button17);
        button18 =(Button)findViewById(R.id.button18);
        button19 =(Button)findViewById(R.id.button19);
        button20 =(Button)findViewById(R.id.button20);


        textView =(TextView)findViewById(R.id.textView);
        textView2 =(TextView)findViewById(R.id.textView2);

    }

    private void compare(){

        if(!Double.isNaN(var1)){
            var2 = Double.parseDouble(textView2.getText().toString());

            switch (operator){
                case ADD :
                    var1 = var1 + var2;
                    break;
                case SUB :
                    var1 = var1 - var2;
                    break;
                case MUL :
                    var1 = var1 * var2;
                    break;
                case DIV :
                    var1 = var1 / var2;
                    break;

                case MOD :
                    var1 = var1 % var2;
                    break;

                case EQUAL:
                    break;

            }
        }

        else {

            var1  =Double.parseDouble(textView2.getText().toString());

        }

    }
}
