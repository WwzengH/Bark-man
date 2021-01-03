package com.example.superman.ui;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.superman.R;
import com.example.superman.ui.fragment.HomeFragMent;
import com.example.superman.ui.fragment.KomeFragMent;
import com.google.android.material.tabs.TabLayout;

import java.sql.Time;

public class MyOrderActivity extends AppCompatActivity {

    private ConstraintLayout mConslayout1;
    private RelativeLayout mRl;
    private TabLayout mOrdertab;
    private HomeFragMent homeFragMent;
    private KomeFragMent komeFragMent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        initView();
        initaddtab();
    }

    private void initView() {
        mConslayout1 = (ConstraintLayout) findViewById(R.id.conslayout1);
        mOrdertab = (TabLayout) findViewById(R.id.ordertab);
        homeFragMent = new HomeFragMent();
        komeFragMent = new KomeFragMent();
        FragmentManager sf = getSupportFragmentManager();
        FragmentTransaction f1 = sf.beginTransaction();
        f1.add(R.id.rl, homeFragMent).hide(komeFragMent);
        f1.commit();
        mOrdertab.addTab(mOrdertab.newTab().setText("全部"));
        mOrdertab.addTab(mOrdertab.newTab().setText("待付费"));

    }

    private void initaddtab() {
        mOrdertab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentManager sf2 = getSupportFragmentManager();
                FragmentTransaction f2 = sf2.beginTransaction();
                if (tab.getPosition() == 0) {
                    f2.show(homeFragMent).hide(komeFragMent);
                } else if (tab.getPosition() == 1) {
                    f2.show(komeFragMent).hide(homeFragMent);
                }
                f2.commit();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}