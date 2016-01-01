package com.mingzi.uitest.drawerlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mingzi.uitest.R;


public class ContentFragment extends Fragment {

    private TextView mTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fg_content,container,false);
        mTextView = (TextView) view.findViewById(R.id.tv_content);
        String text = getArguments().getString("text");
        mTextView.setText(text);
        return view;
    }


}
