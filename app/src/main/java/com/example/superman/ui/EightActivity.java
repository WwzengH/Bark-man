package com.example.superman.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superman.R;
import com.example.superman.ui.adapter.EightRlvAdapter;

import java.util.ArrayList;

public class EightActivity extends AppCompatActivity {

    private RecyclerView eightRlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        initView();
        initRlv();
    }

    private void initRlv() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        eightRlv.setLayoutManager(new LinearLayoutManager(this));
        EightRlvAdapter eightRlvAdapter = new EightRlvAdapter(this,list);
        eightRlv.setAdapter(eightRlvAdapter);
        eightRlvAdapter.notifyDataSetChanged();

    }

    private void initView() {
        eightRlv = findViewById(R.id.eight_rlv);
    }
}