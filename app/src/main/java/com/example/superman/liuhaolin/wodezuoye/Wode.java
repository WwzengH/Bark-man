package com.example.superman.liuhaolin.wodezuoye;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superman.R;

public class Wode extends AppCompatActivity {

    private TextView mWodeText1;
    private RecyclerView mWodeRecv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wode);


        mWodeText1 = findViewById(R.id.wode_text1);
        mWodeRecv = findViewById(R.id.wode_recv);

        mWodeRecv.setLayoutManager(new LinearLayoutManager(Wode.this));
        Adapter adapter = new Adapter();
        mWodeRecv.setAdapter(adapter);
    }

    class Adapter extends RecyclerView.Adapter<Adapter.Holder>{

        @NonNull
        @Override
        public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=View.inflate(Wode.this,R.layout.wode_buju,null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 3;
        }

        public class Holder extends RecyclerView.ViewHolder {

            public Holder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}