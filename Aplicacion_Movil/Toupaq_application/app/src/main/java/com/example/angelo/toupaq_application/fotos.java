package com.example.angelo.toupaq_application;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by r_jeq on 27/10/2017.
 */

public class fotos extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected  void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_imagenes);
       imageView = (ImageView) findViewById(R.id.imagealb);
        Picasso.with(this).load("http://4.bp.blogspot.com/-zS0rzrpo1AM/UMxq407WT1I/AAAAAAAAAMI/wFf_HUwTzJo/s1600/Goa+Hotel.jpg").
                placeholder(R.drawable.hotel1).
                error(R.drawable.hotel2).
                resize(200,200).
                into(imageView);

    }
}
