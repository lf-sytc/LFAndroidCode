package com.example.lfandroidcode.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.lfandroidcode.R;

import java.util.List;

public class MainListViewAdapter extends ArrayAdapter {

    private final int listItemLayoutID;
    public MainListViewAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        listItemLayoutID = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        ViewHolder viewHolder;
        if (null == convertView){
            view = (View) LayoutInflater.from(getContext()).inflate(listItemLayoutID,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.textView = view.findViewById(R.id.list_view_item_title);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        MainItemBean itemBean = (MainItemBean)getItem(position);
        viewHolder.textView.setText(itemBean.getItemTitle());
        return view;
    }

    class ViewHolder{
        TextView textView;
    }
}
