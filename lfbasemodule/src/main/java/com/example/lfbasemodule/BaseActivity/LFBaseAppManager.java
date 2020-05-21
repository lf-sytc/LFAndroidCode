package com.example.lfbasemodule.BaseActivity;

import android.app.Activity;
import android.app.Application;

import java.util.LinkedList;
import java.util.List;

public class LFBaseAppManager extends Application {

    private List<Activity> activityList = new LinkedList<Activity>();
    private static LFBaseAppManager instance;


    public static LFBaseAppManager getInstance() {
        if (null == instance) {
            instance = new LFBaseAppManager();
        }
        return instance;
    }

    public void addActivity(Activity activity){
        activityList.add(activity);
    }

    public void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public void clear(){
        for (Activity activity : activityList){
            activity.finish();
        }
    }

    public Activity getCurrentActivity(){
        int size =  activityList.size();
        if (size > 0){
            return activityList.get(size -1);
        }
        return null;
    }


    public List<Activity> getActivityList(){
        return activityList;
    }
}
