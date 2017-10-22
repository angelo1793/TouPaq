package com.example.angelo.toupaq_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by r_jeq on 20/10/2017.
 */

public class Login extends AppCompatActivity implements  View.OnClickListener {
    Button btningresar;
    Button btnregistrar;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);


        btningresar=(Button) findViewById(R.id.btnin);
        btningresar.setOnClickListener(this);

        btnregistrar=(Button) findViewById(R.id.btconfirmar);
        btnregistrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int btn= v.getId();
        Intent intentIn= new Intent(this,Detares.class);
        Intent intentR= new Intent(this,Registro.class);

        switch (btn){
            case R.id.btnin:
                startActivity(intentIn);break;

            case R.id.btconfirmar:
                startActivity((intentR));break;
        }
    }
}



