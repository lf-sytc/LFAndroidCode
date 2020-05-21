package com.example.lfandroidcode.layoutList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.lfandroidcode.R;
import com.example.lfandroidcode.main.MainItemBean;
import com.example.lfbasemodule.LFBaseListViewActivity;

import java.lang.reflect.Array;

public class LayoutListActivity extends LFBaseListViewActivity {

    private String[] itemNames = {"Linear Layout",};
    private Class[] itemPushClass = {LFBaseListViewActivity.class};

    @Override
    public void initData() {
        super.initData();

        for (int i = 0;i<itemNames.length;i++){
            MainItemBean bean = new MainItemBean(itemPushClass[i],itemNames[i],i);
            mainData.add(bean);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        MainItemBean bean = (MainItemBean) mainData.get(i);
        LFPushActivity(bean.getmClass());
    }
}
