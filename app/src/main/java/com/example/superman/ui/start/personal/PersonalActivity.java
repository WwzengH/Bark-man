package com.example.superman.ui.start.personal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PersonalActivity extends BaseActivity {
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.tv_per)
    TextView tvPer;
    @BindView(R.id.tv_bao)
    TextView tvBao;
    @BindView(R.id.con_head)
    ConstraintLayout conHead;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.img_head)
    ImageView imgHead;
    @BindView(R.id.tv_zl)
    TextView tvZl;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_zz)
    TextView tvZz;
    @BindView(R.id.ll_name)
    LinearLayout llName;
    @BindView(R.id.tv_sex)
    TextView tvSex;
    @BindView(R.id.tv_nan)
    TextView tvNan;
    @BindView(R.id.ll_sex)
    LinearLayout llSex;
    @BindView(R.id.tv_age)
    TextView tvAge;
    @BindView(R.id.tv_14)
    TextView tv14;
    @BindView(R.id.ll_age)
    LinearLayout llAge;
    @BindView(R.id.tv_tel)
    TextView tvTel;
    @BindView(R.id.tv_133)
    TextView tv133;
    @BindView(R.id.ll_tel)
    LinearLayout llTel;
    @BindView(R.id.tv_tel_update)
    TextView tvTelUpdate;
    @BindView(R.id.tv_send)
    Button tvSend;
    @BindView(R.id.ll_update)
    LinearLayout llUpdate;
    @BindView(R.id.tv_pwd)
    TextView tvPwd;
    @BindView(R.id.ll_update_pwd)
    LinearLayout llUpdatePwd;
    @BindView(R.id.tv_pwdd)
    TextView tvPwdd;
    @BindView(R.id.ll_update_pwd2)
    LinearLayout llUpdatePwd2;
    @BindView(R.id.bt_ok)
    Button btOk;

    @Override
    protected int getLayout() {
        return R.layout.activity_personal;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
