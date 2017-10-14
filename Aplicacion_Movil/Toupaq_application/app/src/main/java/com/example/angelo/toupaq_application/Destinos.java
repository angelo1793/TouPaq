package com.example.angelo.toupaq_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Destinos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinos);
        //Crenado lista,arraylist,adaptador
        ListView lista;
        ArrayList<String> destinos;
        ArrayAdapter<String> adaptador;
        //creando lista y  enlazandola con el xml
        lista = (ListView)findViewById(R.id.listDestinos);
        //creacion de arrar list de destinos
        destinos= new ArrayList<String>();
        destinos.add("Arequipa");
        destinos.add("Lima");
        destinos.add("Cuzco");
        destinos.add("Loreto");
        destinos.add("Ica");
        destinos.add("Lambayeque");
        //Creando adaptador
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,destinos);

        lista.setAdapter(adaptador);

        lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
