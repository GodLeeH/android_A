package com.example.myapplication_study;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ContentView extends LinearLayout {
    TextView textView;
    TextView textView2;

    public ContentView(Context context) {
        super(context);

        init(context);
    }

    public ContentView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }


    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_content, this, true);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

    }

    public void setName(String name){
        textView.setText(name);
    }

    public void setContent(String content) {
        textView2.setText(content);
    }

}
