package com.example.reciclaapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_Recicla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_recicla);
    }
    public void tipos(View view){
        Intent tipos = new Intent(this,Tipos.class);
        startActivity(tipos);
}

    public void recicla(View view){
        Intent recicla = new Intent(this,Reciclaje.class);
        startActivity(recicla);
    }
    public void metodos(View view){
        Intent metodos = new Intent(this,Metodos.class);
        startActivity(metodos);
    }
}