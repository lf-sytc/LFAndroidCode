package com.example.lfandroidcode.main;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.lfandroidcode.R;
import com.example.lfandroidcode.layoutList.LayoutListActivity;
import com.example.lfandroidcode.uilist.UIListActivity;
import com.example.lfbasemodule.LFBaseListViewActivity;

import java.util.List;

public class MainActivity extends LFBaseListViewActivity {

    @Override
    public void initData() {
        super.initData();

        MainItemBean bean1 = new MainItemBean("UI相关",1);
        mainData.add(bean1);


        MainItemBean bean2 = new MainItemBean("Layout相关",2);
        mainData.add(bean2);
    }


    @Override
    public void initUI() {
        super.initUI();
    }

    @Override
    public ArrayAdapter configListViewAdapter() {
        MainListViewAdapter adapter = new MainListViewAdapter(this,R.layout.list_view_item,mainData);
        return adapter;

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        MainItemBean bean = (MainItemBean)mainData.get(i);
        switch (bean.getType()){
            case 1:
                startActivityWithClass(UIListActivity.class);
                break;
            case 2:
                startActivityWithClass(LayoutListActivity.class);
                break;
        }

    }

    public void startActivityWithClass(Class mClass){
        Intent intent = new Intent(this,mClass);
        startActivity(intent);
    }

}
