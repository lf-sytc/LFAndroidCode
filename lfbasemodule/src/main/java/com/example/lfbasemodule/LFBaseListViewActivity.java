package com.example.lfbasemodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LFBaseListViewActivity extends LFBaseActivity  implements AdapterView.OnItemClickListener {

    public ListView mainListView;
    public List<Object> mainData;

    @Override
    public void initData() {
        mainData = new ArrayList<Object>();
    }

    @Override
    public void initUI() {
        mainListView = findViewById(R.id.lfbase_mainListView);
        mainListView.setAdapter(configListViewAdapter());
        mainListView.setOnItemClickListener(this);
    }


    public ArrayAdapter configListViewAdapter(){
        ArrayAdapter arrayAdapter = new ArrayAdapter<Object>(
                this,R.layout.base_list_item,mainData
        );
        return  arrayAdapter;
    }

    @Override
    public int mainViewID() {
        return R.layout.activity_lfbase_list_view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
