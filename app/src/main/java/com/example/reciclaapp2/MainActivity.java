package com.example.reciclaapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button boton_1;
    VideoView videoview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton_1 = findViewById(R.id.boton_1);
        videoview2 = findViewById(R.id.videoview2);
        videoview2.setVideoPath("android.resource://"+getPackageName()+"/" + R.raw.video2);
        videoview2.setMediaController(new MediaController(this ));
        videoview2.start();
    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this,Menu_Recicla.class);
      startActivity(siguiente);
   }

}