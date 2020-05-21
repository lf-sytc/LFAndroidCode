package com.example.lfandroidcode.uilist;

import androidx.annotation.Nullable;

import android.os.Bundle;

import com.example.lfandroidcode.main.MainItemBean;
import com.example.lfandroidcode.uilist.viewActivity.ViewActivity;
import com.example.lfbasemodule.BaseRecyclerViewActitity.LFBaseRecyclerViewActivity;

public class UIListActivity extends LFBaseRecyclerViewActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("UI组件相关");
    }

    private String[] itemNames = {"View","TextView","Button","EditView",};
    private Class[] itemPushClass = {ViewActivity.class,UIListActivity.class,UIListActivity.class,UIListActivity.class};

    @Override
    public void initData() {
        super.initData();

        for (int i = 0;i<itemNames.length;i++){
            MainItemBean bean = new MainItemBean(itemPushClass[i],itemNames[i],i);
            mainData.add(bean);
        }
    }

    @Override
    public androidx.recyclerview.widget.RecyclerView.Adapter configAdapter() {
        return super.configAdapter();
    }


    //    @Override
//    public ArrayAdapter configListViewAdapter() {
//        MainListViewAdapter adapter = new MainListViewAdapter(this,R.layout.list_view_item,mainData);
//        return adapter;
//
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        MainItemBean bean = (MainItemBean)mainData.get(i);
//        startActivityWithClass(bean.getmClass());
//    }
//
//    public void startActivityWithClass(Class mClass){
//        Intent intent = new Intent(this,mClass);
//        startActivity(intent);
//    }

}
