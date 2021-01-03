package com.example.superman.liuhaolin.youhuijuan;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;
import com.example.superman.liuhaolin.xiaoxi.fragment.NoFragment;
import com.example.superman.liuhaolin.xiaoxi.fragment.YesFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class YouhuiJuanActivity extends AppCompatActivity {

    private View mYouhuiView;
    private TabLayout mYouhuiTab;
    private ViewPager mYouhuiVp;
    private ArrayList<Fragment> fragments;
    private String []arr={"未使用","使用"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youhui_juan);

        mYouhuiView = findViewById(R.id.youhui_view);
        mYouhuiTab = findViewById(R.id.youhui_tab);
        mYouhuiVp = findViewById(R.id.youhui_vp);

        fragments = new ArrayList<>();
        fragments.add(new NoFragment());
        fragments.add(new YesFragment());
        mYouhuiVp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
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
        mYouhuiTab.setupWithViewPager(mYouhuiVp);
    }
}