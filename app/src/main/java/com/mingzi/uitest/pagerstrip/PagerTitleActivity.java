package com.mingzi.uitest.pagerstrip;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import com.mingzi.uitest.R;

import java.util.ArrayList;

public class PagerTitleActivity extends AppCompatActivity {
    private ArrayList<View> mViewArrayList;
    private ArrayList<String> mTitleArrayList;
    private PagerTitleAdapter mPagerTitleAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_title);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mViewPager = (ViewPager) findViewById(R.id.strip_viewpager);
        initView();
    }
    private void initView(){
        mViewArrayList = new ArrayList<>();
        mTitleArrayList = new ArrayList<>();
        LayoutInflater mLayoutInflater = getLayoutInflater();
        mViewArrayList.add(mLayoutInflater.inflate(R.layout.view_one,null,false));
        mViewArrayList.add(mLayoutInflater.inflate(R.layout.view_two,null,false));
        mViewArrayList.add(mLayoutInflater.inflate(R.layout.view_three,null,false));
        mTitleArrayList.add("橘黄");
        mTitleArrayList.add("淡黄");
        mTitleArrayList.add("浅棕");
        mPagerTitleAdapter = new PagerTitleAdapter(mViewArrayList,mTitleArrayList);
        mViewPager.setAdapter(mPagerTitleAdapter);
    }
}
