package com.example.superman.liuhaolin.xiaoxi;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superman.R;

public class XiaoXiActivity extends AppCompatActivity {

    private View mXiaoxiView;
    private RecyclerView mXiaoxiRecv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiao_xi);

        mXiaoxiView = findViewById(R.id.xiaoxi_view);
        mXiaoxiRecv = findViewById(R.id._xiaoxi_recv);
        initData();
    }

    private void initData() {
        mXiaoxiRecv.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter();
        mXiaoxiRecv.setAdapter(adapter);
    }

    class Adapter extends RecyclerView.Adapter<Adapter.Holder>{

        @NonNull
        @Override
        public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=View.inflate(XiaoXiActivity.this,R.layout.xiaoxi_buju,null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 5;
        }

        public class Holder extends RecyclerView.ViewHolder {

            public Holder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}