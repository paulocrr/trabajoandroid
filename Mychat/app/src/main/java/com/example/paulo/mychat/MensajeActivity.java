package com.example.paulo.mychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MensajeActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        String nombre =getIntent().getExtras().getString("nom");
        setTitle(nombre);
        listView=(ListView)findViewById(R.id.listaMensajes);
        String[] values = {"Stefani: Hola","Yo: Hola que tal"};
        ArrayList<String> list = new ArrayList<>();
        for (int i =0;i<values.length;i++){
            list.add(values[i]);
        }

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }
}
