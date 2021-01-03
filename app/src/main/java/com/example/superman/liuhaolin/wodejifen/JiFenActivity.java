package com.example.superman.liuhaolin.wodejifen;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;
import com.example.superman.liuhaolin.wodejifen.fragment.HuoQuFragment;
import com.example.superman.liuhaolin.wodejifen.fragment.QuanFragment;
import com.example.superman.liuhaolin.wodejifen.fragment.ShiYongFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class JiFenActivity extends AppCompatActivity {

    private View mJifenView;
    private ImageView mJifenImg;
    private TabLayout mJifenTab;
    private ViewPager mJifenVp;
    private String []arr={"全部","获取","使用"};
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_fen);

        mJifenView = findViewById(R.id.jifen_view);
        mJifenImg = findViewById(R.id.jifen_img);
        mJifenTab = findViewById(R.id.jifen_tab);
        mJifenVp = findViewById(R.id.jifen_vp);

        initData();
    }

    private void initData() {
        fragments = new ArrayList<>();
        fragments.add(new QuanFragment());
        fragments.add(new HuoQuFragment());
        fragments.add(new ShiYongFragment());

        mJifenVp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return arr[position];
            }
        });
        mJifenTab.setupWithViewPager(mJifenVp);
    }
}