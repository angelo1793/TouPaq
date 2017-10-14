package com.example.angelo.toupaq_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Paquetes extends   AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paquetes);

        ListView lista;
        ArrayList<String> paquetes;
        ArrayAdapter<String> adaptador;

        paquetes= new ArrayList<String>();
        paquetes.add("Arequipa");
        paquetes.add("Lima");
        paquetes.add("Cuzco");
        paquetes.add("Loreto");
        paquetes.add("Ica");
        paquetes.add("Lambayeque");
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paquetes);
        lista = (ListView)findViewById(R.id.listPaquetes);
        lista.setAdapter(adaptador);
    }
}
