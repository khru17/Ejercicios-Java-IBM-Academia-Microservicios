package com.ibm.academia.caja;

public class Caja {
    // Atributos
    private Integer ancho;
    private Integer alto;
    private Integer profundo;

    // Constructores
    public Caja()
    {

    }

    public Caja(Integer ancho, Integer alto, Integer profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Modificadores

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getProfundo() {
        return profundo;
    }

    public void setProfundo(Integer profundo) {
        this.profundo = profundo;
    }

    public Integer calcularVolumen( )
    {
        Integer volumen;
        volumen = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen de la caja es = " + volumen);
        return volumen;
    }
}
