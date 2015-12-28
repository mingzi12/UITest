package com.mingzi.uitest.viewflipper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ViewFlipper;

import com.mingzi.uitest.R;

public class StaticViewFlipperActivity extends AppCompatActivity {
    private ViewFlipper mViewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_view_flipper);
        mViewFlipper = (ViewFlipper) findViewById(R.id.flipper_help);
        mViewFlipper.startFlipping();

    }
}