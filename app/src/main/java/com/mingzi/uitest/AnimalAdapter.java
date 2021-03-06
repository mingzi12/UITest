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
public class AnimalAdapter extends BaseAdapter {

    private LinkedList<Animal> mData;
    private Context mContext;

    public AnimalAdapter(LinkedList<Animal> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
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
        if (convertView==null) {
            LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
            convertView = mLayoutInflater.inflate(R.layout.item_list_animal, parent, false);
            mViewHolder=new ViewHolder();
            mViewHolder.img_icon  = (ImageView) convertView.findViewById(R.id.img_icon);
            mViewHolder.txt_aName = (TextView) convertView.findViewById(R.id.txt_aName);
            mViewHolder.txt_aSpeak = (TextView) convertView.findViewById(R.id.txt_aSpeak);
            convertView.setTag(mViewHolder);
        }
        else {
          mViewHolder= (ViewHolder) convertView.getTag();
        }
        mViewHolder.img_icon.setBackgroundResource(mData.get(position).getaIcon());
        mViewHolder.txt_aName.setText(mData.get(position).getaName());
        mViewHolder.txt_aSpeak.setText(mData.get(position).getaSpeak());
        return convertView;
    }
    static class ViewHolder {
        ImageView img_icon;
        TextView  txt_aName;
        TextView  txt_aSpeak;
    }
}
