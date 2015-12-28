package com.mingzi.uitest.expandablelistview;

/**
 * Created by Administrator on 2015/12/28.
 */
public class Item {
    int mImgId;
    String mPlayerName;
    public Item(int imgId,String name){
        this.mImgId = imgId;
        this.mPlayerName = name;
    }

    public int getmImgId() {
        return mImgId;
    }

    public String getmPlayerName() {
        return mPlayerName;
    }
}
