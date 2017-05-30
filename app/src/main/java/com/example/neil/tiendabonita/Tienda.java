package com.example.neil.tiendabonita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tienda extends AppCompatActivity {
    public static float total=0;
    public static CheckBox cbxBlusa;
    public static CheckBox cbxTenis;
    public static CheckBox cbxPantalon;
    public static CheckBox cbxBolsita;
    public static float precioBlusa=399;
    public static float precioTenis=449;
    public static float precioPantalon=299;
    public static float precioBolsita=169;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
        this.total=0;
    }
    public void imgClick(View v) {
        CheckBox cbx=(CheckBox)findViewById(R.id.cbxBolsita);
        switch (v.getId()){
            case R.id.imgBlusa:
                cbx=(CheckBox)findViewById(R.id.cbxBlusa);
                break;
            case R.id.imgTenis:
                cbx=(CheckBox)findViewById(R.id.cbxTenis);
                break;
            case R.id.imgPantalon:
                cbx=(CheckBox)findViewById(R.id.cbxPantalon);
                break;
            case R.id.imgBolsita:
                cbx=(CheckBox)findViewById(R.id.cbxBolsita);
                break;
        }
        if(cbx.isChecked())
            cbx.setChecked(false);
        else
            cbx.setChecked(true);
    }
    public void btnSiguienteClick(View v){
        cbxBlusa=(CheckBox)findViewById(R.id.cbxBlusa);
        cbxTenis=(CheckBox)findViewById(R.id.cbxTenis);
        cbxPantalon=(CheckBox)findViewById(R.id.cbxPantalon);
        cbxBolsita=(CheckBox)findViewById(R.id.cbxBolsita);
        if(cbxBlusa.isChecked())
            total+=precioBlusa;
        if(cbxTenis.isChecked())
            total+=precioTenis;
        if(cbxPantalon.isChecked())
            total+=precioPantalon;
        if(cbxBolsita.isChecked())
            total+=precioBolsita;
        Intent pasar=new Intent(Tienda.this, Total.class);
        startActivity(pasar);
        this.finish();
    }
}
