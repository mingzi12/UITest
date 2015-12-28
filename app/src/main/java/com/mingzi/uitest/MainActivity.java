package com.mingzi.uitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mingzi.uitest.autocompletetext.AutoCompleteTextActivity;
import com.mingzi.uitest.expandablelistview.ExpandableListViewActivity;
import com.mingzi.uitest.gridview.GridViewActivity;
import com.mingzi.uitest.spinner.SpinnerActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private Button mUpdateBtn;
    private Button mSpinnerBtn;
    private Button mAutoCompleteBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNextBtn();
        initSimplebtn();
        initBaseBtn();
        initUpdateAdapterBtn();
        initGridViewBtn();
        initSpinnerBtn();
        initAutoCompleteText();
        initExpandableViewBtn();
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
    public void initUpdateAdapterBtn(){
        mUpdateBtn= (Button) findViewById(R.id.mUpdateAdapter);
        mUpdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent mUpdateIntent=new Intent(MainActivity.this,UpdateListViewActivity.class);
                startActivity(mUpdateIntent);
            }
        });
    }
    public void initGridViewBtn(){
        Button mGridViewBtn= (Button) findViewById(R.id.mGridViewBtn);
        mGridViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mGridViewIntent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(mGridViewIntent);
            }
        });

    }
    public void initSpinnerBtn(){
        mSpinnerBtn= (Button) findViewById(R.id.mSpinnerBtn);
        mSpinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mSpinerIntent=new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(mSpinerIntent);
            }
        });
    }
    public void initAutoCompleteText(){
        mAutoCompleteBtn = (Button) findViewById(R.id.mAutoCompleteBtn);
        mAutoCompleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mAutoIntent = new Intent(MainActivity.this, AutoCompleteTextActivity.class);
                startActivity(mAutoIntent);
            }
        });
    }
    public void initExpandableViewBtn(){
        Button mExpandViewBtn = (Button) findViewById(R.id.mExpandViewBtn);
        mExpandViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mExpIntent = new Intent(MainActivity.this, ExpandableListViewActivity.class);
                startActivity(mExpIntent);
            }
        });
    }
}
