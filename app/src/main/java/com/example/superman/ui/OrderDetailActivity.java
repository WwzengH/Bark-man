package com.example.superman.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.bean.MyOrderBean;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderDetailActivity extends BaseActivity {


    @BindView(R.id.order_xq)
    TextView orderXq;
    @BindView(R.id.txt_xf)
    TextView txtXf;
    @BindView(R.id.order_zt)
    TextView orderZt;
    @BindView(R.id.order_hm)
    TextView orderHm;
    @BindView(R.id.order_time)
    TextView orderTime;
    @BindView(R.id.order_name)
    TextView orderName;
    @BindView(R.id.order_phone)
    TextView orderPhone;
    @BindView(R.id.order_address)
    TextView orderAddress;
    @BindView(R.id.order_conlayout1)
    ConstraintLayout orderConlayout1;
    @BindView(R.id.order_xx)
    TextView orderXx;
    @BindView(R.id.order_img1)
    ImageView orderImg1;
    @BindView(R.id.order_txt1)
    TextView orderTxt1;
    @BindView(R.id.order_price)
    TextView orderPrice;
    @BindView(R.id.order_conlayout2)
    ConstraintLayout orderConlayout2;
    @BindView(R.id.order_text_jg)
    TextView orderTextJg;
    @BindView(R.id.order_price2)
    TextView orderPrice2;
    @BindView(R.id.order_text_yh)
    TextView orderTextYh;
    @BindView(R.id.order_price3)
    TextView orderPrice3;
    @BindView(R.id.order_text_yhj)
    TextView orderTextYhj;
    @BindView(R.id.order_price4)
    TextView orderPrice4;
    @BindView(R.id.order_text_ddzj)
    TextView orderTextDdzj;
    @BindView(R.id.order_price5)
    TextView orderPrice5;
    private MyOrderBean myOrderBean;

    @Override
    protected int getLayout() {
        return R.layout.activity_order_detail;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        myOrderBean = new MyOrderBean();
        myOrderBean.setName("南先生");
        myOrderBean.setPrice(600);
        myOrderBean.setPhone("1345678922");
        myOrderBean.setAddress("河南树皮村朝铭店铺");
        myOrderBean.setOrder(123456);

        initfuzhi();
    }

    //todo 进行赋值行为
    @Override
    protected void initData() {


    }

    private void initfuzhi() {
        orderName.setText(myOrderBean.getName());
        orderPrice5.setText(myOrderBean.getPrice()+"");
        orderAddress.setText(myOrderBean.getAddress());
        orderPhone.setText(myOrderBean.getPhone()+"");
        orderHm.setText("订单号码:"+myOrderBean.getOrder()+"");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO:OnCreate Method has been created, run FindViewById again to generate code
        setContentView(R.layout.activity_order_detail);
        ButterKnife.bind(this);
        initView();
    }
}