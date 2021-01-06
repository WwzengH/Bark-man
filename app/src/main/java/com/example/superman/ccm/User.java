package com.example.superman.ccm;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Browser;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.superman.R;
import com.example.superman.base.BaseActivity;
import com.example.superman.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class User extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.tv_terms)
    TextView tvTerms;
    @BindView(R.id.bnt_login)
    Button bntLogin;

    @Override
    protected int getLayout() {
        return R.layout.activity_user;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

        bntLogin.setOnClickListener(this);

        //添加富文本
        String content = tvTerms.getText().toString();
        //起始位置
        int startpos1 = content.indexOf("《");
        int endpos1 = content.indexOf("》", startpos1 + 1)+1;
        int startpos2 = content.indexOf("《", endpos1 + 1);
        int endpos2 = content.lastIndexOf("》")+1;
        SpannableStringBuilder stringBuilder = new SpannableStringBuilder(content);
        stringBuilder.setSpan(new ForegroundColorSpan(Color.BLUE),startpos1,endpos1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        stringBuilder.setSpan(new ForegroundColorSpan(Color.BLUE),startpos2,endpos2, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        //富文本点击事件
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Log.e("TAG", "onClick: "+"点击了富文本" );
                //点击文字跳转到百度
                Uri uri = Uri.parse("http://www.baidu.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.putExtra(Browser.EXTRA_APPLICATION_ID,getPackageName());
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                //super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };


        stringBuilder.setSpan(clickableSpan,startpos1,endpos1,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        //stringBuilder.setSpan(clickableSpan,startpos2,endpos2,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        tvTerms.setMovementMethod(LinkMovementMethod.getInstance());
        tvTerms.setText(stringBuilder);

    }


    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bnt_login:
                startActivity(new Intent(User.this,CourseSelection.class));
                break;
        }
    }
}
