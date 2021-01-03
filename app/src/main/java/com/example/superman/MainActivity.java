package com.example.superman;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.ui.Home.ActivityFragment;
import com.example.superman.ui.Home.CurriculumFragment;
import com.example.superman.ui.Home.MyFragment;
import com.example.superman.ui.Home.PageFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rl_main)
    ViewPager rlMain;
    @BindView(R.id.table)
    TabLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTab();

    }

    private void initTab() {
        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment());
        list.add(new CurriculumFragment());
        list.add(new ActivityFragment());
        list.add(new MyFragment());
        rlMain.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        table.setupWithViewPager(rlMain);
        table.getTabAt(0).setText("首页").setIcon(R.drawable.tab_shop1);
        table.getTabAt(1).setText("课程").setIcon(R.drawable.tab_shop2);
        table.getTabAt(2).setText("活动").setIcon(R.drawable.tab_shop3);
        table.getTabAt(3).setText("我的").setIcon(R.drawable.tab_shop5);
    }
}