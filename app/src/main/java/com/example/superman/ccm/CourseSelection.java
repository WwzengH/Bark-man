package com.example.superman.ccm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CourseSelection extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.content_input)
    ConstraintLayout contentInput;
    @BindView(R.id.bnt_ok)
    Button bntOk;

    @Override
    protected int getLayout() {
        return R.layout.activity_courseselection;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        bntOk.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bnt_ok:
                startActivity(new Intent(CourseSelection.this,CourseFigure.class));
                break;
        }
    }
}
