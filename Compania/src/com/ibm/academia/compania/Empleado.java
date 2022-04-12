package com.ibm.academia.compania;

public class Empleado extends Persona
{
    // Atributos
    private Double remuneracion;
    private static  Integer empleadoId = 0;

    // Constructor
    public Empleado() {

    }

    public Empleado(String nombre, String appellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, appellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++empleadoId;
    }

    // Modificadores
    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Empleado ID: "+ this.empleadoId +
                "\n" + "Remuneracion: " + this.remuneracion;
    }

    // Método aumentar remuneracion

}
