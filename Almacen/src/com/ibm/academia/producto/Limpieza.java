package com.ibm.academia.producto;

public class Limpieza extends Producto{

    // Atributos
    private String componentes;
    private  Double litros;

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }
}
