package com.mingzi.uitest.expandablelistview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.mingzi.uitest.R;

import java.util.ArrayList;

public class ExpandableListViewActivity extends AppCompatActivity {

    private ArrayList<Group> gData = null;
    private ArrayList<ArrayList<Item>> iData = null;
    private ArrayList<Item> lData = null;
    private Context mContext;
    private ExpandableListView mExpandListView;
    private MyBaseExpandableListAdapter myAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);
        mContext = ExpandableListViewActivity.this;
        mExpandListView = (ExpandableListView) findViewById(R.id.mExpenableView_player);


        //数据准备
        gData = new ArrayList<Group>();
        iData = new ArrayList<ArrayList<Item>>();
        gData.add(new Group("AD"));
        gData.add(new Group("AP"));
        gData.add(new Group("TANK"));

        lData = new ArrayList<Item>();

        //AD组
        lData.add(new Item(R.mipmap.ic_anthony,"安东尼"));
        lData.add(new Item(R.mipmap.ic_black_cat,"黑猫"));
        lData.add(new Item(R.mipmap.ic_kobe1,"科比"));
        lData.add(new Item(R.mipmap.ic_lbj1,"詹姆斯"));
        iData.add(lData);
        //AP组
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.ic_anthony,"安东尼"));
        lData.add(new Item(R.mipmap.ic_lbj1,"詹姆斯"));
        lData.add(new Item(R.mipmap.ic_black_cat,"黑猫"));
        lData.add(new Item(R.mipmap.ic_kobe1,"科比"));
        iData.add(lData);
        //TANK组
        lData = new ArrayList<Item>();

        lData.add(new Item(R.mipmap.ic_kobe1,"科比"));
        lData.add(new Item(R.mipmap.ic_lbj1,"詹姆斯"));
        lData.add(new Item(R.mipmap.ic_anthony,"安东尼"));
        lData.add(new Item(R.mipmap.ic_black_cat,"黑猫"));
        iData.add(lData);

        myAdapter = new MyBaseExpandableListAdapter(gData,iData,mContext);
        mExpandListView.setAdapter(myAdapter);

        //为列表设置点击事件
        mExpandListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition,
                                        int childPosition, long id) {
                Toast.makeText(mContext, "你点击了：" + iData.get(groupPosition).get(childPosition).getmPlayerName(),
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }

}
