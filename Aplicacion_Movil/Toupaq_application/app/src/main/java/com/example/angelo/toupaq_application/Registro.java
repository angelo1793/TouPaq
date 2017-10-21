package com.example.angelo.toupaq_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by r_jeq on 20/10/2017.
 */

public class Registro extends AppCompatActivity implements View.OnClickListener {
    Button btnregis;
    @Override

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_registro);

        btnregis = (Button) findViewById(R.id.btconfirmar);
                btnregis.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int btn = v.getId();
        Intent intentLog= new Intent(this,Login.class);

        startActivity(intentLog);
    }

}

