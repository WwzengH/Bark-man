package com.example.superman.ui.Home.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.base.BaseAdapter;
import com.example.superman.interfaces.IBasePresenter;

import java.util.List;

public class CurrfaAdapter extends BaseAdapter {

    public CurrfaAdapter(Context context, List<String> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_currfa;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TextView viewById = (TextView) vh.getViewById(R.id.tv_name);
        String arr= (String) data;
        viewById.setText(arr);
    }
}
