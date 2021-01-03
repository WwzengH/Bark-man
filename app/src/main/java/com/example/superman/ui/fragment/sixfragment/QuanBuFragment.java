package com.example.superman.ui.fragment.sixfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.superman.R;
import com.example.superman.ui.adapter.SixRlvAdapter;

import java.util.ArrayList;


public class QuanBuFragment extends Fragment {

    private RecyclerView rlv;

    public QuanBuFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_quan_bu, container, false);
        rlv = inflate.findViewById(R.id.six_riv);
        initRlv();
        return inflate;
    }

    private void initRlv() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaaa");
        rlv.setLayoutManager(new LinearLayoutManager(getActivity()));
        SixRlvAdapter sixRlvAdapter = new SixRlvAdapter(getActivity(), list);
        rlv.setAdapter(sixRlvAdapter);
        sixRlvAdapter.notifyDataSetChanged();


    }
}