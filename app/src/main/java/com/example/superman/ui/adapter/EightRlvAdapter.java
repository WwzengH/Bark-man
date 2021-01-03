package com.example.superman.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.superman.R;
import com.example.superman.base.BaseAdapter;

import java.util.List;

public class EightRlvAdapter extends BaseAdapter<String> {
    public EightRlvAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.layout_eight_rlv_item;
    }

    @Override
    protected void bindData(String data, VH vh) {
        ImageView iv = (ImageView) vh.getViewById(R.id.eight_rlv_iv);
        TextView tv1 = (TextView) vh.getViewById(R.id.eight_rlv_tv1);
        TextView tv4 = (TextView) vh.getViewById(R.id.eight_rlv_tv4);

        tv1.setText(data + "");

        iv.setTag(1);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (int) iv.getTag();
                if (tag == 1) {
                    tv4.setVisibility(View.VISIBLE);
                    iv.setImageResource(R.mipmap.down);
                    iv.setTag(2);
                } else if (tag == 2) {

                    iv.setImageResource(R.mipmap.up);
                    tv4.setVisibility(View.GONE);
                    iv.setTag(1);
                }


            }
        });

    }
}
