package com.example.angelo.toupaq_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnpaquete, btndestino,btnestadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndestino=(ImageButton) findViewById(R.id.btn_destino);
        btnpaquete=(ImageButton) findViewById(R.id.btn_paquete);
        btnestadisticas= (ImageButton) findViewById(R.id.btn_estadistica);
        btndestino.setOnClickListener(this);
        btnpaquete.setOnClickListener(this);
        btnestadisticas.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
    int btn=v.getId();
        Intent intentD= new Intent(this,Destinos.class);
    switch (btn){
        case R.id.btn_destino:
            startActivity(intentD);break;
        case R.id.btn_estadistica:
            Toast.makeText(this, "Boton Estadistica", Toast.LENGTH_SHORT).show();break;
        case R.id.btn_paquete:
            Toast.makeText(this, "Boton Paquete", Toast.LENGTH_SHORT).show();break;
    }

    }
}
