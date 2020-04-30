package com.example.lfandroidcode.uilist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.lfandroidcode.R;
import com.example.lfandroidcode.layoutList.LayoutListActivity;
import com.example.lfandroidcode.main.MainItemBean;
import com.example.lfandroidcode.main.MainListViewAdapter;
import com.example.lfbasemodule.LFBaseListViewActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UIListActivity extends LFBaseListViewActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("UI组件相关");
    }

    @Override
    public void initData() {
        super.initData();

        MainItemBean bean1 = new MainItemBean("View",1);
        mainData.add(bean1);

        MainItemBean bean2 = new MainItemBean("Button",2);
        mainData.add(bean2);

        MainItemBean bean3 = new MainItemBean("EditView",3);
        mainData.add(bean3);

        MainItemBean bean4 = new MainItemBean("TextView",4);
        mainData.add(bean4);

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
//                startActivityWithClass(UIListActivity.class);
                break;
            case 2:
//                startActivityWithClass(LayoutListActivity.class);
                break;
        }

    }

    public void startActivityWithClass(Class mClass){
        Intent intent = new Intent(this,mClass);
        startActivity(intent);
    }

}
