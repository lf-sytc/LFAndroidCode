package com.example.lfandroidcode.main;

public class MainItemBean {


    public Class getmClass() {
        return mClass;
    }

    public void setmClass(Class mClass) {
        this.mClass = mClass;
    }

    public MainItemBean(Class mClass, String itemTitle, int type) {
        this.mClass = mClass;
        ItemTitle = itemTitle;
        Type = type;
    }

    public Class mClass;



    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public String ItemTitle;

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int Type;
}
