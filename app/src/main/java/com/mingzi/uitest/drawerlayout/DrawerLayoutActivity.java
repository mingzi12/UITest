package com.mingzi.uitest.drawerlayout;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.mingzi.uitest.Data;
import com.mingzi.uitest.R;
import com.mingzi.uitest.gridview.MyAdapter;

import java.util.ArrayList;

public class DrawerLayoutActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mListView;
    private ArrayList<Data> mDataArrayList;
    private MyAdapter<Data> mDataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout_1);
        mListView = (ListView) findViewById(R.id.item_listview);

        mDataArrayList = new ArrayList<Data>();
        mDataArrayList.add(new Data(R.mipmap.ic_launcher,"实时信息"));
        mDataArrayList.add(new Data(R.mipmap.ic_black_cat,"提醒通知"));
        mDataArrayList.add(new Data(R.mipmap.ic_frankenstein,"活动路线"));
        mDataArrayList.add(new Data(R.mipmap.ic_pumpkin, "相关设置"));
        mDataAdapter = new MyAdapter<Data>(mDataArrayList,R.layout.update_list_item) {
            @Override
            public void bindView(ViewHolder holder, Data obj) {
                holder.setImageResource(R.id.icon_ImageView, obj.getImgId());
                holder.setText(R.id.text1, obj.getContent());
            }
        };
        mListView.setAdapter(mDataAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContentFragment contentFragment = new ContentFragment();
                Bundle args = new Bundle();
                args.putString("text", mDataArrayList.get(position).getContent());
                contentFragment.setArguments(args);
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.content_fragment, contentFragment).commit();
                mDrawerLayout.closeDrawer(mListView);


            }
        });


    }
}