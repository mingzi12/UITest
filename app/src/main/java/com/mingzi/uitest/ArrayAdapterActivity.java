package com.mingzi.uitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ArrayAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
//        ArrayAdapter<CharSequence> mArrayAdapter=ArrayAdapter.createFromResource(ArrayAdapterActivity.this,
//                R.array.madapterarray,android.R.layout.simple_expandable_list_item_1);
//        ListView mListView= (ListView) findViewById(R.id.mListView);
//        mListView.setAdapter(mArrayAdapter);
    }

}
