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
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private RatingBar ratingBar;
private TextView textView;
private SeekBar seekBar;
private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

ratingBar = (RatingBar ) findViewById(R.id.ratingBar);
seekBar = (SeekBar) findViewById(R.id.seekBar);
textView = (TextView) findViewById(R.id.textView1);
textView2 = (TextView) findViewById(R.id.textView2);

seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        textView2.setText("Power Distribution : "+seekBar.getProgress()+"/"+seekBar.getMax());
        Toast.makeText(MainActivity.this,seekBar.getProgress()+"/"+seekBar.getMax(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(MainActivity.this,"onStartTrackingTouch",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(MainActivity.this,"onStopTrackingTouch",Toast.LENGTH_SHORT).show();

    }
});

ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        textView.setText("Your Rating is : "+rating);
        Toast.makeText(MainActivity.this,rating+" Rating !!! ",Toast.LENGTH_SHORT).show();

    }
});

    }


}
