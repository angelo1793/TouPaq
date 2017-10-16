package com.example.angelo.toupaq_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Paquetes extends   AppCompatActivity implements View.OnClickListener {
    Spinner spinnerp;
    Spinner spinnerc;
    TextView etext1;
    TextView etext2;
    Button  btnmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paquetes);

        // DECLARANDO LOS SPINER Y EL TEXTO QUE SE MOSTRARA LO QUE SELECCION DEL SPINNER


        etext1=(TextView) findViewById(R.id.textView2);
        spinnerc=(Spinner)findViewById(R.id.spinner2);
        etext2=(TextView) findViewById(R.id.textView3);
        spinnerp=(Spinner)findViewById(R.id.spinner);
        btnmenu=(Button)  findViewById(R.id.button);
        btnmenu.setOnClickListener( this);
        ListView lista;
        ArrayList<String> paquetes;
        ArrayAdapter<String> adaptador;



        // ESTE CODIGO MUESTRA LA LISTA DE PAQUETES
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


        //LISTA DEL PRIMER SPINENER

        //Creando la lista de objetos
        List list= new ArrayList();
        list.add("500-1000>");
        list.add("1000-1900>");
        list.add("2000-2750>");
        list.add("2750-más");

        //LISTA DEL SEGUNDO SPINENER

        //Creando la lista de objetos
        List list2= new ArrayList();
        list2.add("Lima");
        list2.add("Cuzco");
        list2.add("Trujillo");
        list2.add("Arequipa");


        ArrayAdapter arrayAdapter2=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerp.setAdapter(arrayAdapter2);

        ArrayAdapter arrayAdapter3=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list2);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerc.setAdapter(arrayAdapter3);



    }


    public void onClick(View v) {
        int btn=v.getId();
        Intent intentM= new Intent(this,MainActivity.class);

        switch (btn){
            case R.id.button:
                startActivity(intentM);break;

        }

    }



}
