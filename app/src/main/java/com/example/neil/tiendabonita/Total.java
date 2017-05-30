package com.example.neil.tiendabonita;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Total extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        TextView lblSuma = (TextView) findViewById(R.id.lblTotales);
        lblSuma.setText("\n\n\n");
        if (Tienda.cbxBlusa.isChecked() || Tienda.cbxTenis.isChecked() || Tienda.cbxPantalon.isChecked() || Tienda.cbxBolsita.isChecked()) {
            if (Tienda.cbxBlusa.isChecked())
                lblSuma.setText(lblSuma.getText().toString() + Tienda.cbxBlusa.getText().toString() + ".....$" + Tienda.precioBlusa+ "\n");
            if (Tienda.cbxTenis.isChecked())
                lblSuma.setText(lblSuma.getText().toString() + Tienda.cbxTenis.getText().toString() + ".....$" + Tienda.precioTenis+ "\n");
            if (Tienda.cbxPantalon.isChecked())
                lblSuma.setText(lblSuma.getText().toString() + Tienda.cbxPantalon.getText().toString() + ".....$" + Tienda.precioPantalon+ "\n");
            if(Tienda.cbxBolsita.isChecked())
                lblSuma.setText(lblSuma.getText().toString()+Tienda.cbxBolsita.getText().toString()+".....$"+Tienda.precioBolsita+"\n");
        }else
            lblSuma.setText("No has comprado nada.");
        TextView lblTotal=(TextView)findViewById(R.id.lblTotal);
        lblTotal.setText("$"+Tienda.total);
    }
    public void btnComprarClick(View v){
        int duracion=Toast.LENGTH_SHORT;
        CharSequence texto="GRACIAS POR SU COMPRA\nTotal: "+Tienda.total;
        Context contexto = getApplicationContext();
        Toast.makeText(contexto, texto, duracion).show();
    }
    public void btnInicioClick(View v){
        Intent pasar=new Intent(Total.this, Bienvenida.class);
        startActivity(pasar);
        this.finish();
    }
}
