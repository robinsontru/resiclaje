package com.example.reciclaapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Reciclaje extends AppCompatActivity {
    VideoView vvinicial;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaje);
        vvinicial=findViewById(R.id.vvinicial);
        vvinicial.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video1);
        vvinicial.setMediaController(new MediaController(this));
        vvinicial.start();
    }
}