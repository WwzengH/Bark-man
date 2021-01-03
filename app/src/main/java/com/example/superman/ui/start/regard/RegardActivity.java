package com.example.superman.ui.start.regard;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;


import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
//TODO 关于页面
public class RegardActivity extends BaseActivity {
    //--
    @BindView(R.id.tv_certification)
    TextView tvCertification;

    @Override
    protected int getLayout() {
        return R.layout.activity_regard;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        tvCertification.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
