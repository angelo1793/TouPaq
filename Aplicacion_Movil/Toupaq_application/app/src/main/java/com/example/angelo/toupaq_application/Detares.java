package com.example.angelo.toupaq_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r_jeq on 21/10/2017.
 */

public class Detares extends AppCompatActivity implements  View.OnClickListener{
    Spinner spinnercan;
    Button btnconf;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_paquetes_detalles2);

        spinnercan = (Spinner) findViewById(R.id.spinnercant);
        btnconf = (Button) findViewById(R.id.btconfirmar);
        btnconf.setOnClickListener(this);

        List listca= new ArrayList();
        listca.add("1");
        listca.add("2");
        listca.add("3");
        listca.add("4");

        ArrayAdapter arrayAdapterca=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,listca);
        arrayAdapterca.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercan.setAdapter(arrayAdapterca);
    }


    @Override
    public void onClick(View v) {
        int btn = v.getId();
        Intent intentme= new Intent(this,Mensaje_reserva.class);

        startActivity(intentme);
    }
}
