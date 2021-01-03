package com.example.superman.ui.fragment;

import android.widget.TextView;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.bean.MyOrderBean;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;

public class HomeFragMent extends BaseFragment {

    @BindView(R.id.dingdan)
    TextView dingdan;
    @BindView(R.id.wc)
    TextView wc;
    @BindView(R.id.gq)
    TextView gq;
    @BindView(R.id.xdsj)
    TextView xdsj;
    @BindView(R.id.price)
    TextView price;
    @Override
    protected int getLayout() {
        return R.layout.home_fragment_layout;
    }
    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        inittextfz();

    }

    private void inittextfz() {//赋值
    }

    @Override
    protected void initData() {
        MyOrderBean myOrderBean = new MyOrderBean();
        myOrderBean.setOrder(123456789);
        myOrderBean.setPrice(500);
        dingdan.setText("订单编号："+myOrderBean.getOrder()+"");
        price.setText(myOrderBean.getPrice()+"");
    }
}
