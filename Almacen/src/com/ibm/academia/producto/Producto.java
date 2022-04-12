package com.ibm.academia.producto;

import java.io.Serializable;

public class Producto implements Serializable {
    // Atrobutos
    private String nombre;
    private  Double precio;

    // Modificadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


}
