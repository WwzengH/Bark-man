package com.example.superman.liuhaolin.wodekengcheng.fragment;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.liuhaolin.wodekengcheng.fragment.fragment.LuBoKeFragment;
import com.example.superman.liuhaolin.wodekengcheng.fragment.fragment.YiDuiYFragment;
import com.example.superman.liuhaolin.wodekengcheng.fragment.fragment.ZhiBoFragment;
import com.example.superman.liuhaolin.wodekengcheng.fragment.fragment.bean.DrumBean;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

//架子鼓
public class DrumFragment extends BaseFragment {
    private TabLayout mDrumTab;
    private ViewPager mDrumVp;
    private ArrayList<Fragment> fragments;
    private String []arr={"一对一","录播课","直播课"};
    private RecyclerView mRecv;
    private ArrayList<DrumBean> objects;

    @Override
    protected int getLayout() {
        return R.layout.fragment_drum;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView(View view) {
//        mDrumTab = view.findViewById(R.id.drum_tab);
//        mDrumVp = view.findViewById(R.id.drum_vp);
        mRecv = view.findViewById(R.id.drum_recv);

        mRecv.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter adapter = new Adapter();
        mRecv.setAdapter(adapter);
    }

    @Override
    protected void initData() {

    }

    class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            if (viewType==1){
                View view=View.inflate(getActivity(),R.layout.buju_aaa,null);
                return new Holder(view);
            }else{
                View view1=View.inflate(getActivity(),R.layout.buju_bbb,null);
                return new Holder2(view1);
            }
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 2;
        }

        @Override
        public int getItemViewType(int position) {
            if (position%2==0){
                return 1;
            }else{
                return 2;
            }
        }

        class Holder extends RecyclerView.ViewHolder{

            public Holder(@NonNull View itemView) {
                super(itemView);
            }
        }

        class Holder2 extends RecyclerView.ViewHolder{

            public Holder2(@NonNull View itemView) {
                super(itemView);
            }
        }
    }


    //   @Override
//    protected void initData() {
//        fragments = new ArrayList<>();
//        fragments.add(new YiDuiYFragment());
//        fragments.add(new ZhiBoFragment());
//        fragments.add(new LuBoKeFragment());


//        mDrumVp.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
//            @NonNull
//            @Override
//            public Fragment getItem(int position) {
//                return fragments.get(position);
//            }
//
//            @Override
//            public int getCount() {
//                return fragments.size();
//            }
//
//            @NonNull
//            @Override
//            public Object instantiateItem(@NonNull ViewGroup container, int position) {
//                return fragments.get(position);
//            }
//        });
//        mDrumTab.setupWithViewPager(mDrumVp);
//
//        mDrumTab.getTabAt(0).setText("一对一");
//        mDrumTab.getTabAt(1).setText("录播课");
//        mDrumTab.getTabAt(2).setText("直播课");
//        mDrumTab.setSelectedTabIndicatorHeight(0);
    }



