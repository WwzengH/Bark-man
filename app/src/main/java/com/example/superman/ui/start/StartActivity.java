package com.example.superman.ui.start;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.example.superman.MainActivity;
import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;
import com.example.superman.ui.start.login.LoginActivity;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class StartActivity extends BaseActivity {
    @BindView(R.id.vp_start)
    ViewPager vpStart;
    private ArrayList<View> views;
    private TextView tv_timer;
    Disposable disposable;
    @Override
    protected int getLayout() {
        return R.layout.activity_start;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        views = new ArrayList<View>();
        View vp_one = LayoutInflater.from(this).inflate(R.layout.start_one, null);
        View vp_two = LayoutInflater.from(this).inflate(R.layout.start_two, null);
        View vp_three = LayoutInflater.from(this).inflate(R.layout.start_three, null);
        views.add(vp_one);
        views.add(vp_two);
        views.add(vp_three);
        StartVp startVp = new StartVp(this,views);
        vpStart.setAdapter(startVp);
        tv_timer = vp_three.findViewById(R.id.tv_timer);
        vpStart.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 2){//在最后一页执行倒计时
                    //TODO            Interval操作符(有范围)：创建一个按照固定时间发射整数序列的Observable
                    disposable = Observable.intervalRange(0, 4, 0, 1, TimeUnit.SECONDS) //起始值，发送总数量，初始延迟，固定延迟
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(new Consumer<Long>() {
                                @Override
                                public void accept(Long aLong) throws Exception {
                                    long time = 3 - aLong;
                                    tv_timer.setText(time+"s");
                                    if(time == 0){
                                        startActivity(new Intent(StartActivity.this, LoginActivity.class));
                                    }
                                }
                            });
                }else{
                    cancelCallback();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
    private void cancelCallback() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }
}
