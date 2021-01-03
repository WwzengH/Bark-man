package com.example.superman.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;

import com.example.superman.R;
import com.example.superman.base.BaseAdapter;

import java.util.List;

public class FiveRlvAdapter extends BaseAdapter<String> {
    public FiveRlvAdapter(Context context, List<String> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.layout_five_item;
    }

    @Override
    protected void bindData(String data, VH vh) {
        Button bt = (Button) vh.getViewById(R.id.five_rlv_bt);
        bt.setText(data);




    }
}
