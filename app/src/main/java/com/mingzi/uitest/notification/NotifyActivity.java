package com.mingzi.uitest.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mingzi.uitest.R;

public class NotifyActivity extends AppCompatActivity implements View.OnClickListener{
    private Notification mNotification;
    private NotificationManager mNotifyMannager;
    private Button mStartBtn;
    private Button mCancelBtn;
    Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        mBitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_black_cat);
        mNotifyMannager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        initView();

    }
    private void initView(){
        mStartBtn = (Button) findViewById(R.id.start_notify_btn);
        mCancelBtn = (Button) findViewById(R.id.cancal_notify_btn);
        mStartBtn.setOnClickListener(this);
        mCancelBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start_notify_btn:
                Intent mNotifyIntent = new Intent(NotifyActivity.this,Notify2Activity.class);
                PendingIntent mPendingIntent = PendingIntent.getActivity(NotifyActivity.this,
                        0,mNotifyIntent,0);
                Notification.Builder mBuilder = new Notification.Builder(this);
                mBuilder.setContentTitle("这是Title");
                mBuilder.setContentText("你好，这是正文");
                mBuilder.setSubText("这是正文下的一段文字");
                mBuilder.setTicker("这是通知栏显示的内容");
                mBuilder.setWhen(System.currentTimeMillis());
                mBuilder.setSmallIcon(R.mipmap.ic_kobe1);
                mBuilder.setLargeIcon(mBitmap);
                mBuilder.setDefaults(Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE
                        | Notification.DEFAULT_SOUND);
                mBuilder.setAutoCancel(true);
                mBuilder.setContentIntent(mPendingIntent);
                mNotification = mBuilder.build();
                mNotifyMannager.notify(1,mNotification);
                break;
            case R.id.cancal_notify_btn:
                mNotifyMannager.cancel(1);
                break;
        }

    }
}
