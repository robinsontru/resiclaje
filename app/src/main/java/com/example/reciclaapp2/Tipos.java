package com.example.reciclaapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class Tipos extends AppCompatActivity {
    Button button_negro, button_blanco, button_verde;
    MediaPlayer sonidonegro, sonidoverde, sonidoblanco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);
        button_negro= findViewById(R.id.btnsonido_negro);
        button_verde =findViewById(R.id.btnsonido_verde);
        button_blanco= findViewById(R.id.btnsonido_blanco);// referenciar

        sonidonegro = MediaPlayer.create(this, R.raw.negro);
        sonidoblanco = MediaPlayer.create(this, R.raw.blanco);
        sonidoverde = MediaPlayer.create(this, R.raw.verde);


        button_negro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                sonidonegro.start();
            }
        });
        button_blanco.setOnClickListener(new View.OnClickListener() {

           public void onClick(View view) {
              sonidoblanco.start();

            }
        });
      button_verde.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
               sonidoverde.start();

           }
       });
   }
    public void menu(View view){
      Intent menu = new Intent(this,Menu_Recicla.class);
      startActivity(menu);
    }
}