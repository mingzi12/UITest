package com.mingzi.uitest.pagerstrip;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/12/31.
 */
public class PagerTitleAdapter extends PagerAdapter {
    private ArrayList<View> mViewArrayList;
    private ArrayList<String> mTitleArrayList;

    public PagerTitleAdapter(ArrayList<View> mViewArrayList, ArrayList<String> mTitleArrayList) {
        this.mViewArrayList = mViewArrayList;
        this.mTitleArrayList = mTitleArrayList;
    }

    @Override
    public int getCount() {
        return mViewArrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewArrayList.get(position));
        return mViewArrayList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViewArrayList.get(position));
    }
    @Override
    public CharSequence  getPageTitle(int position){
        return mTitleArrayList.get(position);
    }
}
