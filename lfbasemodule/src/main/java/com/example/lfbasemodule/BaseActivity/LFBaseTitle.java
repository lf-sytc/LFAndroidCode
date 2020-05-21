package com.example.lfbasemodule.BaseActivity;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lfbasemodule.R;

public class LFBaseTitle extends LinearLayout {

    public TextView titleView;
    public ImageView titleBack;
    public ImageView titleEdit;

    public LFBaseTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.lf_base_title,this);
        titleView = (TextView)findViewById(R.id.title_text);

        titleBack = (ImageView) findViewById(R.id.title_back);
        titleBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });


        titleEdit = (ImageView) findViewById(R.id.title_rightButton);
        titleEdit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"right button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
