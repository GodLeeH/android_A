package com.example.myuisample;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BoardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        adapter = new BoardAdapter();
        adapter.addItem(new BoardItem("산업공학과",0001));
        adapter.addItem(new BoardItem("컴퓨터공학과",0002));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BoardItem item = (BoardItem) adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "선택 : " + item.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }

    class BoardAdapter extends BaseAdapter {
        ArrayList<BoardItem> items = new ArrayList<BoardItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(BoardItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
//            SingeritemView view = new SingeritemView(getApplicationContext());
            BoardItemView  view = null;
            if(convertView == null ){
                view = new BoardItemView(getApplicationContext());
            }else {
                view = (BoardItemView) convertView ;
            }
            BoardItem item = items.get(position);
            view.setName(item.getName());

            return view;
        }
    }

}
