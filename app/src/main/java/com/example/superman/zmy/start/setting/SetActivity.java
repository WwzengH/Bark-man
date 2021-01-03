package com.example.superman.zmy.start.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.zmy.start.personal.PersonalActivity;
import com.example.superman.zmy.start.regard.RegardActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SetActivity extends BaseActivity {
    @BindView(R.id.img_left_one)
    ImageView imgLeftOne;
    @BindView(R.id.con_one)
    ConstraintLayout conOne;
    @BindView(R.id.img_left_two)
    ImageView imgLeftTwo;
    @BindView(R.id.con_two)
    ConstraintLayout conTwo;
    @BindView(R.id.img_left_three)
    ImageView imgLeftThree;
    @BindView(R.id.con_three)
    ConstraintLayout conThree;
    @BindView(R.id.img_left_four)
    ImageView imgLeftFour;
    @BindView(R.id.con_four)
    ConstraintLayout conFour;

    @Override
    protected int getLayout() {
        return R.layout.activity_set;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        imgLeftOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetActivity.this, RegardActivity.class));
            }
        });
        imgLeftFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetActivity.this, PersonalActivity.class));
            }
        });
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
