package com.ibm.academia.compania;

import java.io.Serializable;

public class Persona implements Serializable
{
    // Atributos
    private String nombre;
    private String appellido;
    private String numeroFiscal;
    private String direccion;

    // Constructores
    public Persona(){

    }

    public Persona(String nombre, String appellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.appellido = appellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    // Modificadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.appellido + "\n" +
                "Numero Fiscal: " + this.numeroFiscal + "\n" +
                "Direccion: " + this.direccion;
    }

}
