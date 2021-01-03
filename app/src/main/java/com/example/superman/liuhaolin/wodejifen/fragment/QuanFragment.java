package com.example.superman.liuhaolin.wodejifen.fragment;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superman.R;
import com.example.superman.base.BaseFragment;
import com.example.superman.interfaces.IBasePresenter;

public class QuanFragment extends BaseFragment {

    private RecyclerView mRecv;

    @Override
    protected int getLayout() {
        return R.layout.fragment_quanbu;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView(View view) {
        View view1=View.inflate(getActivity(),R.layout.fragment_quanbu,null);
        mRecv = view1.findViewById(R.id.quanbu_recv);
        mRecv.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter adapter = new Adapter();
        mRecv.setAdapter(adapter);
    }

    @Override
    protected void initData() {

    }
    class Adapter extends RecyclerView.Adapter<Adapter.Holder>{

        @NonNull
        @Override
        public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=View.inflate(getActivity(),R.layout.fragment_buju_quan,null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 4;
        }

        public class Holder extends RecyclerView.ViewHolder {

            public Holder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}
