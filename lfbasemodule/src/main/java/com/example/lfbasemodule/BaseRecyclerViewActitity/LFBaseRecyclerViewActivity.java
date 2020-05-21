package com.example.lfbasemodule.BaseRecyclerViewActitity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lfbasemodule.BaseActivity.LFBaseActivity;
import com.example.lfbasemodule.R;

import java.util.ArrayList;
import java.util.List;

public class LFBaseRecyclerViewActivity extends LFBaseActivity implements LFBaseRecyclerView {

    public RecyclerView mainRecyclerView;
    public List<Object> mainData;

    @Override
    public void initUI() {
        mainRecyclerView = findViewById(R.id.lfbase_recyclerView);
        mainRecyclerView.setLayoutManager(configRecyclerLayoutManager());
        mainRecyclerView.setAdapter(configAdapter());
    }

    @Override
    public void initData() {
        mainData = mainData = new ArrayList<Object>();
    }

    @Override
    public int mainViewID() {
        return R.layout.activity_lfbase_recycler_view;
    }


    public LinearLayoutManager configRecyclerLayoutManager(){
        return new LinearLayoutManager(this);
    }

    @Override
    public RecyclerView.Adapter configAdapter() {
        return new LFBaseRecyclerViewAdapter(mainData);
    }

}
