package com.mingzi.uitest.spinner;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mingzi.uitest.R;
import com.mingzi.uitest.gridview.MyAdapter;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spin_one;
    private Spinner spin_two;
    private Context mContext;
    //判断是否为刚进去时触发onItemSelected的标志
    private boolean one_selected = false;
    private boolean two_selected = false;
    private ArrayList<Hero> mData = null;
    private BaseAdapter myAdadpter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        mContext = SpinnerActivity.this;
        mData = new ArrayList<Hero>();
        bindViews();
    }


    private void bindViews() {
        spin_one = (Spinner) findViewById(R.id.spin_one);
        spin_two = (Spinner) findViewById(R.id.spin_two);

        mData.add(new Hero(R.mipmap.ic_kobe1,"迅捷斥候：提莫（Teemo）"));
        mData.add(new Hero(R.mipmap.ic_lbj1,"诺克萨斯之手：德莱厄斯（Darius）"));
        mData.add(new Hero(R.mipmap.ic_anthony,"无极剑圣：易（Yi）"));
        mData.add(new Hero(R.mipmap.ic_lbj1,"德莱厄斯：德莱文（Draven）"));
        mData.add(new Hero(R.mipmap.ic_kobe2,"德邦总管：赵信（XinZhao）"));
        mData.add(new Hero(R.mipmap.ic_anthony,"狂战士：奥拉夫（Olaf）"));

        myAdadpter = new MyAdapter<Hero>(mData,R.layout.item_spin_hero) {
            @Override
            public void bindView(ViewHolder holder, Hero obj) {
                holder.setImageResource(R.id.img_player_icon,obj.gethIcon());
                holder.setText(R.id.txt_player_name, obj.gethName());
            }
        };
        spin_two.setAdapter(myAdadpter);
        spin_one.setOnItemSelectedListener(this);
        spin_two.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.spin_one:
                if(one_selected){
                    Toast.makeText(mContext,"您的分段是~：" + parent.getItemAtPosition(position).toString(),
                            Toast.LENGTH_SHORT).show();
                }
                else
                    one_selected = true;
                break;
            case R.id.spin_two:
                if(two_selected){
                    TextView txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                    Toast.makeText(mContext, "您选择的英雄是~：" + txt_player_name.getText().toString(),
                            Toast.LENGTH_SHORT).show();
                }else
                    two_selected = true;
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}