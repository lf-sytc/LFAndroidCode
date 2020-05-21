package com.example.lfandroidcode.main;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.lfandroidcode.R;
import com.example.lfandroidcode.layoutList.LayoutListActivity;
import com.example.lfandroidcode.uilist.UIListActivity;
import com.example.lfbasemodule.BaseActivity.LFBaseTitle;
import com.example.lfbasemodule.BaseRecyclerViewActitity.LFBaseRecyclerViewActivity;
import com.example.lfbasemodule.LFBaseListViewActivity;

import java.util.List;

public class MainActivity extends LFBaseListViewActivity {

    private String[] itemNames = {"UI","Layout","text"};
    private Class[] itemPushClass = {UIListActivity.class,LayoutListActivity.class, LFBaseRecyclerViewActivity.class};

    private LFBaseTitle lfBaseTitleView;

    @Override
    public void initData() {
        super.initData();

        for (int i = 0;i<itemNames.length;i++){
            MainItemBean bean = new MainItemBean(itemPushClass[i],itemNames[i],i);
            mainData.add(bean);
        }
    }

    @Override
    public void initUI() {
        super.initUI();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        lfBaseTitleView = findViewById(R.id.lfBaseTitleView);
        lfBaseTitleView.titleView.setText("首页");
        lfBaseTitleView.titleBack.setVisibility(View.INVISIBLE);
        lfBaseTitleView.titleEdit.setVisibility(View.INVISIBLE);
    }

    @Override
    public ArrayAdapter configListViewAdapter() {
        MainListViewAdapter adapter = new MainListViewAdapter(this,R.layout.list_view_item,mainData);
        return adapter;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        MainItemBean bean = (MainItemBean)mainData.get(i);
        LFPushActivity(bean.getmClass());
    }
}
