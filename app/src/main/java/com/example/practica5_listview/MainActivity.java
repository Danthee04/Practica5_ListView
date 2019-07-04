package com.example.practica5_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin", "Gerardo", "Carlos", "David", "Sofia"};
    private String edades [] = {"18","25","20","22","15","30","24","27","22","21"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_goldendream, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + nombres[i] + " es  " + edades[i] + " años");

            }
        });
        }
    }
