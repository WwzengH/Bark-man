package com.example.superman.liuhaolin.wodekengcheng;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.liuhaolin.wodekengcheng.fragment.DrumFragment;
import com.example.superman.liuhaolin.wodekengcheng.fragment.PinaoFragment;
import com.example.superman.liuhaolin.wodekengcheng.fragment.VioLinFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MeKeCheng extends BaseActivity {

    private TextView mMekechengText1;
    private TabLayout mMekechengTab;
    private ConstraintLayout mMekechengCon;
    private ViewPager mMekechengVp;
    private ArrayList<Fragment> fragments;
    private String []arr={"小提琴","架子鼓","钢琴"};

    @Override
    protected int getLayout() {
        return R.layout.activity_me_ke_cheng;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

        mMekechengText1 = findViewById(R.id.mekecheng_text1);
        mMekechengTab = findViewById(R.id.mekecheng_tab);
        mMekechengCon = findViewById(R.id.mekecheng_con);
        mMekechengVp = findViewById(R.id.mekecheng_vp);
    }

    @Override
    protected void initData() {
        fragments = new ArrayList<>();
        fragments.add(new VioLinFragment());
        fragments.add(new DrumFragment());
        fragments.add(new PinaoFragment());

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        mMekechengVp.setAdapter(fragmentAdapter);
        mMekechengTab.setupWithViewPager(mMekechengVp);

        LinearLayout linearLayout = (LinearLayout) mMekechengTab.getChildAt(0);
        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        linearLayout.setDividerDrawable(ContextCompat.getDrawable(this,
                R.drawable.tabshuxian));

        mMekechengTab.setSelectedTabIndicatorHeight(0);
        //tablayout横向滚动
        mMekechengTab.setTabMode( TabLayout.MODE_SCROLLABLE );
        TextView textView = new TextView(MeKeCheng.this);
        mMekechengTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                    //textView.setTextSize(19);
                    textView.setText(tab.getText());
                    textView.setTextAppearance(MeKeCheng.this, R.style.TabLayoutTextSize);
                    tab.setCustomView(textView);

            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setCustomView(null);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    class FragmentAdapter extends FragmentStatePagerAdapter{


        public FragmentAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

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
    }
}