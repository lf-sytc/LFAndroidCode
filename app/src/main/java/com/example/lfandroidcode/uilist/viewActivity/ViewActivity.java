package com.example.lfandroidcode.uilist.viewActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lfandroidcode.R;
import com.example.lfbasemodule.BaseActivity.LFBaseActivity;

public class ViewActivity extends LFBaseActivity implements View.OnClickListener {

    public View contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("View 相关属性");
        findViewById(R.id.viewActivity_button1).setOnClickListener(this);
        findViewById(R.id.viewActivity_button2).setOnClickListener(this);
        findViewById(R.id.viewActivity_button3).setOnClickListener(this);
        findViewById(R.id.viewActivity_button4).setOnClickListener(this);
    }


    @Override
    public void initData() {

    }

    @Override
    public void initUI() {
        contentView = findViewById(R.id.contentView);
    }

    @Override
    public int mainViewID() {
        return R.layout.activity_view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.viewActivity_button1:
                break;
            case R.id.viewActivity_button2:
                break;
            case R.id.viewActivity_button3:
                break;
            case R.id.viewActivity_button4:
                break;
        }
    }
}
