package com.example.parcial;

import android.content.Intent;
import android.widget.EditText;

public class Factura {
    private int cant;
    private double precio;
    private double iva;

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void factura(EditText cant, EditText valor){
        int cantidad = Integer.parseInt(cant.getText().toString());
        double precio = Double.parseDouble(valor.getText().toString());
        this.precio = cantidad * precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Intent iva(){
        iva = this.getPrecio() * 0.19;
        this.precio = this.precio + iva;
        return null;
    }
}
