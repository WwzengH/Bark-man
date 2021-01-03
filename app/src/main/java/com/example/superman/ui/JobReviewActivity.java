package com.example.superman.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;

public class JobReviewActivity extends BaseActivity {


    @Override
    protected int getLayout() {
        return R.layout.activity_job_review;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}