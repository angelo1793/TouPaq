package com.example.angelo.toupaq_application;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by r_jeq on 19/10/2017.
 */

public class confirmar_reserva extends Activity implements View.OnClickListener {

   Button btncan;
    Button btnconf;
@Override
    public void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.confirma_reserva);

    btncan= (Button) findViewById(R.id.btcancel);
    btncan.setOnClickListener( this);
    btnconf= (Button) findViewById(R.id.btconf);
    btnconf.setOnClickListener(this);
}


    @Override
    public void onClick(View v) {
        int btn=v.getId();
        Intent intentM= new Intent(this,Detalle_paquetes.class);
        Intent intentL= new Intent(this,Login.class);

        switch (btn){

            case R.id.btcancel:
                startActivity(intentM); break;

            case R.id.btconf:
                startActivity(intentL); break;
        }
    }


}
