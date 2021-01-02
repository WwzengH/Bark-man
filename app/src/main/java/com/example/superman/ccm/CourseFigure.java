package com.example.superman.ccm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CourseFigure extends BaseActivity {
    @BindView(R.id.tv_look)
    TextView tvLook;
    @BindView(R.id.tv_look1)
    TextView tvLook1;

    @Override
    protected int getLayout() {
        return R.layout.activity_coursefigure;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        tvLook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPop();
            }
        });

        tvLook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPop1();
            }
        });
    }

    private void initPop1() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_item1, null);
        ImageView ivpoppic = inflate.findViewById(R.id.iv_pop1_pic);
        Button bntpopok = inflate.findViewById(R.id.bnt_pop1_ok);
        PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, 1070);
        //设置阴影
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.alpha = 1f;
                getWindow().setAttributes(attributes);
            }
        });

        ivpoppic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        bntpopok.setOnClickListener(new View.OnClickListener() {
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

    private void initPop() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_item, null);
        ImageView ivpoppic = inflate.findViewById(R.id.iv_pop_pic);
        Button bntpopok = inflate.findViewById(R.id.bnt_pop_ok);
        PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, 1650);
        //设置阴影
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.alpha = 1f;
                getWindow().setAttributes(attributes);
            }
        });

        ivpoppic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        bntpopok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CourseFigure.this, Train.class));
            }
        });

        popupWindow.showAtLocation(inflate, Gravity.BOTTOM, 0, 0);

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
