package com.example.superman.liuhaolin.xiaoxi.fragment;

import android.view.View;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.interfaces.IBasePresenter;

public class NoFragment extends BaseFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_no;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }
}
