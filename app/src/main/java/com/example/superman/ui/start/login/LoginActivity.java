package com.example.superman.ui.start.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.ui.start.setting.SetActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.linear_ll)
    LinearLayout linearLl;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.const_cl)
    ConstraintLayout constCl;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.ll_linear)
    LinearLayout llLinear;
    @BindView(R.id.wx_login)
    ImageView wxLogin;
    @BindView(R.id.tv_name)
    TextView tvName;
    private PopupWindow popupWindow;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        //微信跳转
        wxLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SetActivity.class));
            }
        });
        //本机登录跳转
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initPop();
            }
        });
    }
    private void initPop() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.item_pop, null);
        Button no = inflate.findViewById(R.id.btn_no);
        Button yes = inflate.findViewById(R.id.btn_yes);
        PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT,1000);
        //设置阴影
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.alpha = 1f;
                getWindow().setAttributes(attributes);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        popupWindow.showAtLocation(inflate, Gravity.CENTER, 0, 0);

        //关闭阴影
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = 0.3f;
        getWindow().setAttributes(attributes);
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
