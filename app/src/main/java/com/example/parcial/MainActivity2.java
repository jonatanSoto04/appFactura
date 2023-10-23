package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText resFactura ;
    private EditText resImpuesto;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        resFactura = findViewById(R.id.resFactura);
        resImpuesto = findViewById(R.id.resImpuesto);

        Bundle bundle = getIntent().getExtras();
        Factura persona = (Factura) bundle.getSerializable("facturaObjeto");
        resFactura.setText(String.valueOf(persona.getCant()));
        resImpuesto.setText(String.valueOf(persona.getIva()));
    }
}