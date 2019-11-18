package com.example.myapplication_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class subject3 extends AppCompatActivity {
    ListView listview3 ;
    ListViewAdapter adapter;

    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject3);

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview3 = (ListView) findViewById(R.id.listView1);
        listview3.setAdapter(adapter);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        // 첫 번째 아이템 추가.
        adapter.addItem("샘플 제목", "샘플 내용") ;

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editText1.getText().toString();
                String content = editText2.getText().toString();

                adapter.addItem(title, content);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
