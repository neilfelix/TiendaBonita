package com.example.neil.tiendabonita;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }
    public void btnSiguienteClick(View v){
        Intent pasar=new Intent(Bienvenida.this, Tienda.class);
        startActivity(pasar);
        this.finish();
    }
}
