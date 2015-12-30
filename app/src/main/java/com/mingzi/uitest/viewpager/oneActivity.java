package com.mingzi.uitest.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.mingzi.uitest.R;

import java.util.ArrayList;

public class oneActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private ArrayList<View> mArrayList;
    private MyPagerAdapter myPagerAdapter;
    LayoutInflater mLayoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        mArrayList =new ArrayList<>();
        mLayoutInflater = getLayoutInflater();
        mArrayList.add(mLayoutInflater.inflate(R.layout.view_one,null,false));
        mArrayList.add(mLayoutInflater.inflate(R.layout.view_two,null,false));
        mArrayList.add(mLayoutInflater.inflate(R.layout.view_three,null,false));
        myPagerAdapter=new MyPagerAdapter(mArrayList);
        mViewPager.setAdapter(myPagerAdapter);
    }

}
