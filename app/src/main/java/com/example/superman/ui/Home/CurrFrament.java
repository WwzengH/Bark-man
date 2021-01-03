package com.example.superman.ui.Home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CurrFrament extends BaseFragment {
    @BindView(R.id.tab_currf)
    TabLayout tabCurrf;
    @BindView(R.id.vp_currf)
    ViewPager vpCurrf;
    private List<Fragment> list;
    private List<String> arrayList;

    @Override
    protected int getLayout() {
        return R.layout.fragment_currf;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        arrayList = new ArrayList<>();
        list.add(new CurrFArament());
        list.add(new CurrFArament());
        arrayList.add("系列课程");
        arrayList.add("直播课程");
    }

    @Override
    protected void initData() {
        vpCurrf.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return arrayList.get(position);
            }
        });
        tabCurrf.setupWithViewPager(vpCurrf);
    }
}
