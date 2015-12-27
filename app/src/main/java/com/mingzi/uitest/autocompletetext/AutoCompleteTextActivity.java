package com.mingzi.uitest.autocompletetext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.mingzi.uitest.R;

public class AutoCompleteTextActivity extends AppCompatActivity {
    private AutoCompleteTextView mAutoCompleteTextView;
    private MultiAutoCompleteTextView mMultiAutoCompleteTextView;
    private static final String[] data = new String[]{"小猪猪", "小狗狗", "小鸡鸡", "小猫猫", "小咪咪"};
    private static final String[] mArray=new String[]{"小明","小白","小猪","小张","小龙","小丽"};
    private ArrayAdapter<String> mArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);
        mAutoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.mAutoCompleteText);
        mMultiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.mMultiAutoText);
        mArrayAdapter = new ArrayAdapter<>(AutoCompleteTextActivity.this,
                android.R.layout.simple_dropdown_item_1line,mArray);
        mAutoCompleteTextView.setAdapter(mArrayAdapter);
        ArrayAdapter<String> mArrayAdapter1 = new ArrayAdapter<String>(AutoCompleteTextActivity.this,
                android.R.layout.simple_dropdown_item_1line,data);
        mMultiAutoCompleteTextView.setAdapter(mArrayAdapter1);
        mMultiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

}
