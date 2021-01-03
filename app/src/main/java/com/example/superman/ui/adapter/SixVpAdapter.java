package com.example.superman.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class SixVpAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> f;
    String name[] ={"全部","课程","活动","商品"};
    public SixVpAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> f) {
        super(fm);
        this.f = f;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return f.get(position);
    }

    @Override
    public int getCount() {
        return f.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return name[position];
    }
}
