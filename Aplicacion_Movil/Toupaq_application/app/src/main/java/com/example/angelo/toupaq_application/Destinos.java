package com.example.angelo.toupaq_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Destinos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinos);

        ListView lista;
        ArrayList<String> destinos;
        ArrayAdapter<String> adaptador;

        destinos= new ArrayList<String>();
        destinos.add("Arequipa");
        destinos.add("Lima");
        destinos.add("Cuzco");
        destinos.add("Loreto");
        destinos.add("Ica");
        destinos.add("Lambayeque");
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,destinos);
        lista = (ListView)findViewById(R.id.listDestinos);
        lista.setAdapter(adaptador);
    }
}
