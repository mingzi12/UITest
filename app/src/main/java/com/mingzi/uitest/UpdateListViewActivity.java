package com.mingzi.uitest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;

public class UpdateListViewActivity extends AppCompatActivity {
    private LinkedList<Data> mDatas;
    private UpdateAdapter mAdapter;
    private Context mContext;
    private ListView mListView;
    private TextView mTextView;
    private Button mButton;
    private int flag=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_list_view);
        initViews();
        mContext=UpdateListViewActivity.this;
        mDatas = new LinkedList<>();
        mAdapter = new UpdateAdapter( mDatas,mContext);
        mListView.setAdapter(mAdapter);
    }
    public void initViews(){
        mListView= (ListView) findViewById(R.id.updateListView);
        mTextView=(TextView)findViewById(R.id.noData);
        mButton= (Button) findViewById(R.id.addItembtn);
        mListView.setEmptyView(mTextView);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setVisibility(View.GONE);
                mAdapter.add(new Data(R.mipmap.ic_fish,"给猪哥跪了~~~ x " + flag));
                flag++;
            }
        });
    }
}
