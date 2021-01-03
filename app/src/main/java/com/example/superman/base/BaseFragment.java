package com.example.superman.base;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.superman.R;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.interfaces.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<P extends IBasePresenter> extends Fragment implements IBaseView {

    protected P presenter;
    Unbinder unbinder;
    protected Context mContext;
    protected Activity mActivity;
    private View view1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getContext();
        mActivity = getActivity();
        view1 = View.inflate(mContext, getLayout(),null);
        int layout = getLayout();
        View view = null;
        if(layout <= 0){
            new RuntimeException("布局非法");
        }else{
            view = inflater.inflate(layout,container,false);
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this,view);
        presenter = createPrenter();
        if(presenter != null){
            presenter.attachView(this);
        }
        initView(view1);
        initData();
    }

    protected abstract int getLayout();
    protected abstract P createPrenter();
    protected abstract void initView(View view);
    protected abstract  void initData();

    @Override
    public void showLoading(int visible) {

    }

    @Override
    public void showToast(String tips) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
        if(presenter != null){
            presenter.unAttachView();
        }
        mActivity = null;
        mContext = null;
    }
}
