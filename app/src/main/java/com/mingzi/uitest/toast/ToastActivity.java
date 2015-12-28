package com.mingzi.uitest.toast;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mingzi.uitest.R;

public class ToastActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mToastBtn1;
    private Button mToastBtn2;
    private Button mToastBtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        initView();
    }
    private void initView(){
        mToastBtn1 = (Button) findViewById(R.id.toast1);
        mToastBtn1.setOnClickListener(this);
        mToastBtn2 = (Button) findViewById(R.id.toast2);
        mToastBtn2.setOnClickListener(this);
        mToastBtn3 = (Button) findViewById(R.id.toast3);
        mToastBtn3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toast1 :
                midToast1("你点击了第一个按钮", Toast.LENGTH_SHORT);
                break;
            case R.id.toast2 :
                midToast2("你点击了第二个按钮",Toast.LENGTH_SHORT);
                break;
            case R.id.toast3 :
                midToast3("你点击了第三个按钮",Toast.LENGTH_SHORT);
                break;
        }
    }
    void midToast1(String str, int showTime)
    {
        Toast toast = Toast.makeText(ToastActivity.this, str, showTime);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL , 0, 0);  //设置显示位置
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setTextColor(Color.YELLOW);     //设置字体颜色
        toast.show();
    }
    private void midToast2(String str, int showTime)
    {
        Toast toast = Toast.makeText(ToastActivity.this, str, showTime);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM , 0, 0);  //设置显示位置
        LinearLayout layout = (LinearLayout) toast.getView();
        layout.setBackgroundColor(Color.BLUE);
        ImageView image = new ImageView(this);
        image.setImageResource(R.mipmap.ic_pumpkin);
        layout.addView(image, 0);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setTextColor(Color.YELLOW);     //设置字体颜色
        toast.show();
    }
    private void midToast3(String str, int showTime)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.view_toast_custom,
                (ViewGroup) findViewById(R.id.lly_toast));
        ImageView img_logo = (ImageView) view.findViewById(R.id.img_logo);
        TextView tv_msg = (TextView) view.findViewById(R.id.tv_msg);
        tv_msg.setText(str);
        Toast toast = new Toast(ToastActivity.this);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}
