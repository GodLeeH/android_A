package com.example.myapplication_study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.sbject1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),subject1.class);
                startActivity(intent);
            }

        });
        Button button2 = (Button) findViewById(R.id.sbject2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),subject2.class);
                startActivity(intent);
            }

        });
        Button button3 = (Button) findViewById(R.id.sbject3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),subject3.class);
                startActivity(intent);
            }

        });
        Button button4 = (Button) findViewById(R.id.sbject4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),subject4.class);
                startActivity(intent);
            }

        });



    }
}
