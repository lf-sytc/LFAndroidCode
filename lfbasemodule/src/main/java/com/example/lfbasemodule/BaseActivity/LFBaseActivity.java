package com.example.lfbasemodule.BaseActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class LFBaseActivity extends AppCompatActivity implements LFIntentActivityUtil {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mainViewID());
        LFBaseAppManager.getInstance().addActivity(this);
        initData();
        initUI();
    }

    protected void onDestroy() {
        super.onDestroy();
        LFBaseAppManager.getInstance().removeActivity(this);
    }

    public abstract void initUI();
    public abstract void initData();
    public abstract int mainViewID();

    @Override
    public void LFPushActivity(Class<?> mClass) {
        LFPushActivity(mClass,null,false);
    }

    @Override
    public void LFPushActivity(Class<?> mClass, Bundle bundle) {
        LFPushActivity(mClass,bundle,false);
    }

    @Override
    public void LFPushActivity(Class<?> mClass, Bundle bundle,Boolean killThis){
        Intent intent = new Intent(this, mClass);
        if (null != bundle){
            intent.putExtras(bundle);
        }
        startActivity(intent);
        if (killThis == true){
            finish();
        }
    }

    @Override
    public void LFPushActivityForResult(Class<?> mClass, int requestCode) {
        LFPushActivityForResult(mClass,requestCode,null);
    }

    @Override
    public void LFPushActivityForResult(Class<?> mClass, int requestCode, Bundle bundle) {
        Intent intent = new Intent(this, mClass);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }
}
