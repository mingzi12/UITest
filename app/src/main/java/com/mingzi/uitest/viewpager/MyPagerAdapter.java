package com.mingzi.uitest.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/12/30.
 */
public class MyPagerAdapter extends PagerAdapter {
    private ArrayList<View> mViewArrayList;

    public MyPagerAdapter(){}

    public MyPagerAdapter(ArrayList<View> mViewArrayList) {
        this.mViewArrayList = mViewArrayList;
    }

    @Override
    public int getCount() {
        return mViewArrayList.size();
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewArrayList.get(position));
        return mViewArrayList.get(position);
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViewArrayList.get(position));
    }
}
