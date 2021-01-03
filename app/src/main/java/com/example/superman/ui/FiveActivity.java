package com.example.superman.ui;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superman.R;
import com.example.superman.ui.adapter.FiveRlvAdapter;

import java.util.ArrayList;

public class FiveActivity extends AppCompatActivity {

    private TextView fiveTv1;
    private LinearLayout fiveLl;
    private TextView fiveTv2;
    private RecyclerView fiveRlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        initView();
        initRlv();
    }

    private void initRlv() {
        ArrayList<String> list = new ArrayList<>();
        list.add("钢琴");
        list.add("吉他");
        list.add("声乐");
        list.add("小提琴");
        list.add("架子鼓");
        list.add("尤克里里");
        list.add("大提琴");
        list.add("架子鼓");
        list.add("尤克里里");

        fiveRlv.setLayoutManager(new GridLayoutManager(this,3));
        FiveRlvAdapter fiveRlvAdapter = new FiveRlvAdapter(this, list);
        fiveRlv.setAdapter(fiveRlvAdapter);
        fiveRlvAdapter.notifyDataSetChanged();
    }

    private void initView() {
        fiveTv1 = findViewById(R.id.five_tv1);
        fiveLl = findViewById(R.id.five_ll);
        fiveTv2 = findViewById(R.id.five_tv2);
        fiveRlv = findViewById(R.id.five_rlv);
    }
}