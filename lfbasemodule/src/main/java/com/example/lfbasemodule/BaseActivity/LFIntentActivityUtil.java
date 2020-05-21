package com.example.lfbasemodule.BaseActivity;

import android.os.Bundle;

public interface LFIntentActivityUtil {

    void LFPushActivity(Class<?> mClass);

    void LFPushActivity(Class<?> mClass, Bundle bundle);

    void LFPushActivity(Class<?> mClass, Bundle bundle,Boolean killThis);

    void LFPushActivityForResult(Class<?> mClass, int requestCode);

    void LFPushActivityForResult(Class<?> mClass, int requestCode, Bundle bundle);
}
