package com.example.superman.ui.Home;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.ui.Home.Adapter.CurrfaAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CurrFArament extends BaseFragment {
    @BindView(R.id.rv_currfa)
    RecyclerView rvCurrfa;
    private List<String> list;

    @Override
    protected int getLayout() {
        return R.layout.fragment_currfa;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        list.add("钢琴钢琴钢琴");
        list.add("钢琴钢琴钢琴");
        list.add("钢琴钢琴钢琴");
        list.add("钢琴钢琴钢琴");
        list.add("钢琴钢琴钢琴");
        list.add("钢琴钢琴钢琴");
        rvCurrfa.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        CurrfaAdapter currfaAdapter = new CurrfaAdapter(mContext, list);
        rvCurrfa.setAdapter(currfaAdapter);
        currfaAdapter.notifyDataSetChanged();
    }

    @Override
    protected void initData() {

    }
}
