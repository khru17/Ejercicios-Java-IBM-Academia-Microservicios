package com.ibm.academia.compania;

public class Gerente extends Empleado
{
    // Atributos
    private Double presupuesto;

    // Constructores

    public Gerente() {

    }

    public Gerente(String nombre, String appellido, String numeroFiscal, String direccion, Double remuneracion, Double presupuesto) {
        super(nombre, appellido, numeroFiscal, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }


    @Override
    public String toString() {
        System.out.println(super.toString() + "\n" + "Presupuesto" + this.presupuesto);
        return super.toString() + "\n" + "Presupuesto" + this.presupuesto;
    }
}