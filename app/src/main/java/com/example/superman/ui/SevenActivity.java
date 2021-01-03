package com.example.superman.ui;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superman.R;
import com.example.superman.ui.adapter.SevenRlvAdapter;

import java.util.ArrayList;

public class SevenActivity extends AppCompatActivity {

    private Switch sevenSw;
    private TextView sevenTv1;
    private RecyclerView sevenRlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        initView();
        initRlv();
    }

    private void initRlv() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        sevenRlv.setLayoutManager(new LinearLayoutManager(this));
        SevenRlvAdapter sevenRlvAdapter = new SevenRlvAdapter(this,list);
        sevenRlv.setAdapter(sevenRlvAdapter);
        sevenRlvAdapter.notifyDataSetChanged();

    }

    private void initView() {
        sevenSw = findViewById(R.id.seven_sw);
        sevenTv1 = findViewById(R.id.seven_tv1);

        sevenSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sevenTv1.setText("已开启");
                } else {
                    sevenTv1.setText("未开启");
                }
            }
        });

        sevenRlv = findViewById(R.id.seven_rlv);
    }
}