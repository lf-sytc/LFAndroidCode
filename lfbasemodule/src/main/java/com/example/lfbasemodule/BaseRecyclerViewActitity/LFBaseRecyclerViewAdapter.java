package com.example.lfbasemodule.BaseRecyclerViewActitity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lfbasemodule.R;

import java.util.List;

public class LFBaseRecyclerViewAdapter extends RecyclerView.Adapter {


    private List mainData;


    public LFBaseRecyclerViewAdapter(List data){
        mainData = data;
    }


    static class LFBaseRecyclerViewViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public LFBaseRecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.lfbase_recyclerView_title);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lf_base_recycler_cell,parent,false);
        LFBaseRecyclerViewViewHolder holder = new LFBaseRecyclerViewViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String tempStr = (String)mainData.get(position);

        LFBaseRecyclerViewViewHolder lfViewHoder = (LFBaseRecyclerViewViewHolder)holder;
        lfViewHoder.title.setText(tempStr);
    }

    @Override
    public int getItemCount() {
        return mainData.size();
    }
}
