package com.mingzi.uitest.viewflipper;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.mingzi.uitest.R;

public class DynamicViewFlipActivity extends AppCompatActivity {

    private Context mContext;
    private ViewFlipper mDynamicFlipper;
    private int[] resId = {R.mipmap.ic_kobe1,R.mipmap.ic_lbj1,
            R.mipmap.ic_black_cat,R.mipmap.ic_fish};

    private final static int MIN_MOVE = 20;   //最小距离
    private MyGestureListener mgListener;
    private GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_view_flip);
        mContext = DynamicViewFlipActivity.this;
        //实例化SimpleOnGestureListener与GestureDetector对象
        mgListener = new MyGestureListener();
        mDetector = new GestureDetector(this, mgListener);
        mDynamicFlipper = (ViewFlipper) findViewById(R.id.dynamic_flipper_help);
        //动态导入添加子View
        for(int i = 0;i < resId.length;i++){
            mDynamicFlipper.addView(getImageView(resId[i]));
        }

    }

    //重写onTouchEvent触发MyGestureListener里的方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mDetector.onTouchEvent(event);
    }


    //自定义一个GestureListener,这个是View类下的，别写错哦！！！
    private class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float v, float v1) {
            if(e1.getX() - e2.getX() > MIN_MOVE){
                mDynamicFlipper.setInAnimation(mContext,R.anim.right_in);
                mDynamicFlipper.setOutAnimation(mContext, R.anim.right_out);
                mDynamicFlipper.showNext();
            }else if(e2.getX() - e1.getX() > MIN_MOVE){
                mDynamicFlipper.setInAnimation(mContext,R.anim.left_in);
                mDynamicFlipper.setOutAnimation(mContext, R.anim.left_out);
                mDynamicFlipper.showPrevious();
            }
            return true;
        }
    }

    private ImageView getImageView(int resId){
        ImageView img = new ImageView(this);
        img.setBackgroundResource(resId);
        return img;
    }

}
