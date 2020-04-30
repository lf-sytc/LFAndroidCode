package com.example.lfbasemodule;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class LFBaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mainViewID());
        initData();
        initUI();
    }

    public abstract void initUI();
    public abstract void initData();
    public abstract int mainViewID();
}
