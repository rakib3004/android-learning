package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {


    private Button clear;
    private Button exit;
    private Button cse;
    private Button eee;
    private Button me;
    private Button swe;
    private Button rme;


    private TextView counter1;
    private TextView counter2;
    private TextView counter3;

    private final String string1 ="Counter 1 : ";
    private final String string2 ="Counter 2 : ";
    private final String string3 ="Counter 3 : ";
    private String prev;

    private int count;
    private int counting1;
    private int counting2;
    private int counting3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionMethods();

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1.setText(string1+"");
                counter2.setText(string2+"");
                counter3.setText(string3+"");
                prev=null;
                count=0;
                counting1=0;
                counting2=0;
                counting3=0;
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1.setText(string1+"");
                counter2.setText(string2+"");
                counter3.setText(string3+"");
                prev=null;

                exit(0);

            }
        });
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(count==0){
    counter2.setText(string2+"0");
    counter3.setText(string3+"0");

}
    prev = "cse";
    count++;
    counting1++;
    counter1.setText(string1+counting1);



            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    counter1.setText(string1+"0");
                    counter3.setText(string3+"0");

                }

                prev = "eee";
                    count++;
                    counting2++;
                    counter2.setText(string2+counting2);


            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count==0){

                    counter1.setText(string1+"0");
                    counter2.setText(string2+"0");

                }

                prev = "me";
                    count++;
                    counting3++;
                    counter3.setText(string3+counting3);

            }
        });
        swe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count==0){
                    counter1.setText(string1+"0");
                    counter2.setText(string2+"0");
                    counter3.setText(string3+"0");

                }

                  if(prev.equals("eee")){
                    count++;
                    counting2++;
                    counter2.setText(string2+counting2);
                }
                else   if(prev.equals("me")){
                    if(count%2==2){
                        count++;
                        counting3++;
                        counter3.setText(string3+counting3);
                    }

                    else if(count%2==1){
                        count++;
                        counting2++;
                        counter2.setText(string2+counting2);
                    }


                }

                else{
                    count++;
                    counting1++;
                    counter1.setText(string1+counting1);
                }
                prev = "swe";


            }
        });
        rme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
try {


    if (count == 0) {
        counter1.setText(string1 + "0");
        counter2.setText(string2 + "0");
        counter3.setText(string3 + "0");

    }


    if (prev.equals("eee")) {
        count++;
        counting2++;
        counter2.setText(string2 + counting2);
    } else if (prev.equals("me")) {

        count++;
        counting3++;
        counter3.setText(string2 + counting3);
    } else if (prev.equals("rme")) {
        if (count % 3 == 0) {
            count++;
            counting1++;
            counter1.setText(string1 + counting1);
        } else if (count % 3 == 1) {
            count++;
            counting2++;
            counter2.setText(string2 + counting2);
        } else {
            count++;
            counting3++;
            counter3.setText(string2 + counting3);
        }
    } else {
        count++;
        counting1++;
        counter1.setText(string1 + counting1);
    }


    prev = "rme";
}
catch (Exception e){
    System.out.println(e);
}
                }
        });
    }

    private void actionMethods(){

        clear =(Button)findViewById(R.id.button);
        exit =(Button)findViewById(R.id.button2);
        cse =(Button)findViewById(R.id.button3);
        eee =(Button)findViewById(R.id.button4);
        me =(Button)findViewById(R.id.button5);
        swe =(Button)findViewById(R.id.button6);
        rme =(Button)findViewById(R.id.button7);


        counter1 =(TextView)findViewById(R.id.textView3);
        counter2 =(TextView)findViewById(R.id.textView);
        counter3 =(TextView)findViewById(R.id.textView2);

    }
}
