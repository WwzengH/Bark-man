package com.example.superman.song;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.superman.R;


public class Coursepayment1Activity extends AppCompatActivity {

    private ImageView img;
    private TextView price2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursepayment1);
        initView();
    }

    private void initView() {
        img = (ImageView) findViewById(R.id.img);
        price2 = (TextView) findViewById(R.id.price2);

        SpannableString sp = new SpannableString(price2.getText().toString());
        sp.setSpan(new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        price2.setText(sp);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View root = LayoutInflater.from(Coursepayment1Activity.this).inflate(R.layout.item_pop, null);
                PopupWindow popupWindow = new PopupWindow(root, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT);
                popupWindow.setBackgroundDrawable(new ColorDrawable());
                popupWindow.setOutsideTouchable(true);
                TextView price2 = root.findViewById(R.id.price2);
                Button btn = root.findViewById(R.id.btn);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Coursepayment1Activity.this,Coursepayment2Activity.class));
                    }
                });

                SpannableString sp = new SpannableString(price2.getText().toString());
                sp.setSpan(new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                price2.setText(sp);
                popupWindow.showAtLocation(img, Gravity.BOTTOM, 0, 0);
            }
        });
    }
}