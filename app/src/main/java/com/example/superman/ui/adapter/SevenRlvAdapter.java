package com.example.superman.ui.adapter;

import android.content.Context;

import com.example.superman.R;
import com.example.superman.base.BaseAdapter;

import java.util.List;

public class SevenRlvAdapter extends BaseAdapter {
    public SevenRlvAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.layout_seven_rlv_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {

    }
}
