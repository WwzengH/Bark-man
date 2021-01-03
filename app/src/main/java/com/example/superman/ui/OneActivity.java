package com.example.superman.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.superman.R;

public class OneActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        initView();


    }

    private void initView() {
        tv1 = findViewById(R.id.one_tv1);
        tv2 = findViewById(R.id.one_tv2);
        CheckBox cb = findViewById(R.id.one_cb);
        cb.setText("登录即将代表同意<<中国移动认证服务条款>>和<<用户协议>>");

        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one_tv1:
                tv1.setTextColor(Color.BLACK);
                tv2.setTextColor(Color.parseColor("#e0e0e0"));
                break;
            case R.id.one_tv2:
                tv2.setTextColor(Color.BLACK);
                tv1.setTextColor(Color.parseColor("#e0e0e0"));
                break;
        }
    }
}