package com.example.superman.ui.Home.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.superman.R;
import com.example.superman.base.BaseAdapter;

import org.w3c.dom.Text;

import java.nio.file.Path;
import java.util.List;

public class HomePageAdapter extends BaseAdapter {
    public HomePageAdapter(Context context, List<PageBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_page;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TextView name = (TextView) vh.getViewById(R.id.tv_name);
        PageBean arr= (PageBean) data;
        name.setText(arr.getImage());
    }
}
