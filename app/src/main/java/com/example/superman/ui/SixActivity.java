package com.example.superman.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;
import com.example.superman.ui.adapter.SixVpAdapter;
import com.example.superman.ui.fragment.sixfragment.HuoDongFragment;
import com.example.superman.ui.fragment.sixfragment.KeChengFragment;
import com.example.superman.ui.fragment.sixfragment.QuanBuFragment;
import com.example.superman.ui.fragment.sixfragment.ShangPinFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class SixActivity extends AppCompatActivity {

    private TabLayout sixTab;
    private ViewPager sixVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        initView();
        initVp();

    }

    private void initVp() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new QuanBuFragment());
        fragments.add(new KeChengFragment());
        fragments.add(new ShangPinFragment());
        fragments.add(new HuoDongFragment());

        SixVpAdapter sixVpAdapter = new SixVpAdapter(getSupportFragmentManager(), fragments);
        sixVp.setAdapter(sixVpAdapter);

        sixTab.setupWithViewPager(sixVp);
    }

    private void initView() {
        sixTab = findViewById(R.id.six_tab);
        sixVp = findViewById(R.id.six_vp);
    }
}