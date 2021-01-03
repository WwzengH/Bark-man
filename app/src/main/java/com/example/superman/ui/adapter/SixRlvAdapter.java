package com.example.superman.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.superman.R;
import com.example.superman.base.BaseAdapter;

import java.util.List;

public class SixRlvAdapter extends BaseAdapter {
    public SixRlvAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.layout_six_rlv_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TextView tv1 = (TextView) vh.getViewById(R.id.six_rlv_tv1);
        TextView tv2 = (TextView) vh.getViewById(R.id.six_rlv_tv2);
        TextView tv3 = (TextView) vh.getViewById(R.id.six_rlv_tv3);
        tv1.setText("钢琴一对一陪练课程");
        tv2.setText("金悦悦老师");
        tv3.setText("200/小时");
    }
}
