package com.example.myuisample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class BoardItemView extends LinearLayout {
    TextView text_department;

    public BoardItemView(Context context) {
        super(context);

        init(context);
    }

    public BoardItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }


    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.board_item, this, true);

        text_department = (TextView) findViewById(R.id.text_department);

    }

    public void setName(String name){
        text_department.setText(name);
    }
}
