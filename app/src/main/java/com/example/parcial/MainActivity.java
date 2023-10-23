package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;


public class MainActivity extends AppCompatActivity {
    private EditText prod;
    private EditText valor;
    private Button agregar, factura;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prod = findViewById(R.id.producto);
        valor = findViewById(R.id.costo);
        agregar = findViewById(R.id.agregar);
        Factura persona = new Factura();
        agregar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                persona.factura(prod, valor);
                prod.setText(String.valueOf(""));
                valor.setText(String.valueOf(""));
            }
        });
        factura = findViewById(R.id.facturar);
        factura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("facturaObjeto", (Serializable) persona);
                startActivity(intent);
            }
        });
    }
}