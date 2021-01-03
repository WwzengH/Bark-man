package com.example.superman.ui.Home;

import android.net.VpnManager;

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

public class CurriculumFragment extends BaseFragment {


    @BindView(R.id.tab_curriculum)
    TabLayout tabCurriculum;
    @BindView(R.id.vp_curriculum)
    ViewPager vpCurriculum;
    private List<Fragment> list;
    private List<String> arrayList;

    @Override
    protected int getLayout() {
        return R.layout.fragment_curriculum;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        arrayList = new ArrayList<>();
        list.add(new CurrFrament());
        list.add(new CurrFrament());
        list.add(new CurrFrament());
        list.add(new CurrFrament());
        arrayList.add("音乐素养");
        arrayList.add("音乐考级");
        arrayList.add("成人学习");
        arrayList.add("乐器");

    }

    @Override
    protected void initData() {

        vpCurriculum.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
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
        tabCurriculum.setupWithViewPager(vpCurriculum);
    }
}
