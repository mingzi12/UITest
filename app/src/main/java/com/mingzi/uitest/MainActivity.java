package com.mingzi.uitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar mSeekbar;
    private TextView mTextView;
    private RatingBar mRatingBar;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSeekBarViews();
        initRatingBarViews();
        initNextBtn();
        initSimplebtn();
        initBaseBtn();
    }
    public void initSeekBarViews(){
        mSeekbar= (SeekBar) findViewById(R.id.sb_normal);
        mTextView= (TextView) findViewById(R.id.mtext);
        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mTextView.setText("当前进度是" + progress + "/100");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "按下Seekbar", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "离开Seekbar", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void initRatingBarViews(){
        mRatingBar= (RatingBar) findViewById(R.id.mRatingBar);
        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Rating" + String.valueOf(rating),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void initNextBtn(){
        mButton= (Button) findViewById(R.id.arrayadapter);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(nextIntent);
            }
        });
    }
    public  void initSimplebtn(){
        Button simpleadapter= (Button) findViewById(R.id.simpleadapter);
        simpleadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent simpleIntent=new Intent(MainActivity.this,SimpleAdapterActivity.class);
                startActivity(simpleIntent);
            }
        });
    }
    public void initBaseBtn(){
        Button mBaseButton= (Button) findViewById(R.id.mBaseAdapter);
        mBaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mBaseIntent=new Intent(MainActivity.this,BaseAdapterActivity.class);
                startActivity(mBaseIntent);
            }
        });
    }


   
}
