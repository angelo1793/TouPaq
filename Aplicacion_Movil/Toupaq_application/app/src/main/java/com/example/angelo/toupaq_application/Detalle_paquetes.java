package com.example.angelo.toupaq_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by r_jeq on 17/10/2017.
 */

public class Detalle_paquetes extends AppCompatActivity implements View.OnClickListener{
    Button btnmenu;
    Button btnreservar;
    Button btnfotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paquetes_detalles);


    btnmenu=(Button) findViewById(R.id.button2);
    btnmenu.setOnClickListener( this);
    btnreservar=(Button) findViewById(R.id.button);
    btnreservar.setOnClickListener(this);
        btnfotos=(Button) findViewById(R.id.buttonfot);
        btnfotos.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        int btn=v.getId();
        Intent intentM= new Intent(this,MainActivity.class);
        Intent intentR= new Intent(this,confirmar_reserva.class);
        Intent intentF= new Intent(this,fotos.class);
        switch (btn){

            case R.id.button2:
                startActivity(intentR); break;

            case R.id.button:
                startActivity(intentM); break;

            case R.id.buttonfot:
                startActivity(intentF); break;
            
        }

    }
}
