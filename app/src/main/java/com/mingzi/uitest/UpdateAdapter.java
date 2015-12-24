package com.mingzi.uitest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Administrator on 2015/12/24.
 */
public class UpdateAdapter extends BaseAdapter {
    private LinkedList<Data> mDatas;
    private Context mContext;
    public UpdateAdapter() {

    }

    public UpdateAdapter(LinkedList<Data> mDatas, Context mContext) {
        this.mDatas = mDatas;
        this.mContext = mContext;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder=null;
        if(convertView==null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.update_list_item,parent,false);
            mViewHolder=new ViewHolder();
            mViewHolder.icon_Img.setBackgroundResource(mDatas.get(position).getImgId());
            mViewHolder.txt_context.setText(mDatas.get(position).getContent());
            convertView.setTag(mViewHolder);
        }
        else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.icon_Img.setBackgroundResource(mDatas.get(position).getImgId());
        mViewHolder.txt_context.setText(mDatas.get(position).getContent());
        return convertView;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }
    private class ViewHolder{
        ImageView icon_Img;
        TextView txt_context;
    }
    public void add(Data data) {
        if (mDatas == null) {
            mDatas = new LinkedList<>();
        }
        mDatas.add(data);
        notifyDataSetChanged();
    }
}
