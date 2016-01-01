package com.mingzi.uitest;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mingzi.uitest.autocompletetext.AutoCompleteTextActivity;
import com.mingzi.uitest.drawerlayout.DrawerLayoutActivity;
import com.mingzi.uitest.expandablelistview.ExpandableListViewActivity;
import com.mingzi.uitest.gridview.GridViewActivity;
import com.mingzi.uitest.notification.NotifyActivity;
import com.mingzi.uitest.pagerstrip.PagerTitleActivity;
import com.mingzi.uitest.spinner.SpinnerActivity;
import com.mingzi.uitest.toast.ToastActivity;
import com.mingzi.uitest.viewflipper.DynamicViewFlipActivity;
import com.mingzi.uitest.viewflipper.StaticViewFlipperActivity;
import com.mingzi.uitest.viewpager.ViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private Button mUpdateBtn;
    private Button mSpinnerBtn;
    private Button mAutoCompleteBtn;
    private TextView mConfigTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNotifyBtn();
        initNextBtn();
        initSimplebtn();
        initBaseBtn();
        initUpdateAdapterBtn();
        initGridViewBtn();
        initSpinnerBtn();
        initAutoCompleteText();
        initExpandableViewBtn();
        initFlipBtn();
        initDynamicFlipBtn();
        initToastBtn();
        initViewPagerBtn();
        initPagerTitleBtn();
        initDrawerBtn();
        initConfigTextView();
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
    public void initExpandableViewBtn() {
        Button mExpandViewBtn = (Button) findViewById(R.id.mExpandViewBtn);
        mExpandViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mExpIntent = new Intent(MainActivity.this, ExpandableListViewActivity.class);
                startActivity(mExpIntent);
            }
        });
    }
       public void initFlipBtn() {
           Button mFlipBtn = (Button) findViewById(R.id.flipper_btn);
           mFlipBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent mFlipBtnIntent = new Intent(MainActivity.this, StaticViewFlipperActivity.class);
                   startActivity(mFlipBtnIntent);
               }
           });
       }
           public void initDynamicFlipBtn(){
        Button mDynamicBtn = (Button) findViewById(R.id.dynamic_flipper_btn);
        mDynamicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mDynaFlipIntent = new Intent(MainActivity.this, DynamicViewFlipActivity.class);
                startActivity(mDynaFlipIntent);
            }
        });
    }
            public void initToastBtn(){
                Button mToastBtn = (Button) findViewById(R.id.toastBtn);
                mToastBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent mToastIntent = new Intent(MainActivity.this, ToastActivity.class);
                        startActivity(mToastIntent);
                    }
                });
         }
        public void initNotifyBtn(){
            Button mNotifyBtn = (Button) findViewById(R.id.notify_btn);
            mNotifyBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mNotifyIntent = new Intent(MainActivity.this, NotifyActivity.class);
                    startActivity(mNotifyIntent);
                }
            });
        }
    public void initViewPagerBtn(){
        Button mViewPagerBtn = (Button) findViewById(R.id.viewpager_btn);
        mViewPagerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mViewPagerIntent = new Intent(MainActivity.this,ViewActivity.class);
                startActivity(mViewPagerIntent);
            }
        });
    }
    public void initPagerTitleBtn(){
        Button mPagerTitleBtn = (Button) findViewById(R.id.pager_title_btn);
        mPagerTitleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mPagerTitleIntent = new Intent(MainActivity.this, PagerTitleActivity.class);
                startActivity(mPagerTitleIntent);
            }
        });
    }
    public void initDrawerBtn(){
        Button mDrawerBtn = (Button) findViewById(R.id.drawerlayout_btn);
        mDrawerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mDrawerBtnIntent = new Intent(MainActivity.this, DrawerLayoutActivity.class);
                startActivity(mDrawerBtnIntent);
            }
        });
    }
    public void initConfigTextView(){
        mConfigTextView = (TextView) findViewById(R.id.config_textView);
        StringBuffer mConfigBuffer = new StringBuffer();
        Configuration mConfiguration = getResources().getConfiguration();
        mConfigBuffer.append(mConfiguration.densityDpi+";");
        mConfigBuffer.append(mConfiguration.screenHeightDp+";");
        mConfigBuffer.append(mConfiguration.screenWidthDp+".");
        mConfigTextView.setText(mConfigBuffer.toString());

    }
}
