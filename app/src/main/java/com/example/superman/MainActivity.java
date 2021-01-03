package com.example.superman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.superman.ui.start.StartActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mStartBtn = (Button) findViewById(R.id.btn_start);
        mStartBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                // TODO 20/12/30
                startActivity(new Intent(this, StartActivity.class));
                break;
            default:
                break;
        }
    }
}