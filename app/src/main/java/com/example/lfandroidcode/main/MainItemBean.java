package com.example.lfandroidcode.main;

public class MainItemBean {

    public MainItemBean(String title,int type){
        super();
        setItemTitle(title);
        setType(type);
    }

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
