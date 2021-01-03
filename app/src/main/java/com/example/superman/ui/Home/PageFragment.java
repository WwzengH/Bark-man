package com.example.superman.ui.Home;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.ui.Home.Adapter.HomePageAdapter;
import com.example.superman.ui.Home.Adapter.HomeTwoPageAdapter;
import com.example.superman.ui.Home.Adapter.PageBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class PageFragment extends BaseFragment {
    @BindView(R.id.rv_home)
    RecyclerView rvHome;
    @BindView(R.id.rv_twohome)
    RecyclerView rvTwohome;
    private List<PageBean> list;

    @Override
    protected int getLayout() {
        return R.layout.fragment_page;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        PageBean pageBean = new PageBean();
        pageBean.setImage("钢琴直播课程");
        pageBean.setTitle("12月5日晚8点直播|一起来参加把！");
        list.add(pageBean);
        list.add(pageBean);
        HomePageAdapter homePageAdapter = new HomePageAdapter(mContext, list);
        rvHome.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        rvHome.setAdapter(homePageAdapter);
        rvTwohome.setLayoutManager(new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false));
        HomeTwoPageAdapter homeTwoPageAdapter = new HomeTwoPageAdapter(mContext, list);
        rvTwohome.setAdapter(homeTwoPageAdapter);
    }

    @Override
    protected void initData() {

    }
}
