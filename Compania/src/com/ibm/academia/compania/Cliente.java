package com.ibm.academia.compania;

public class Cliente extends Persona
{
    // Atributos
    private static Integer clienteId = 0;

    // Constructores
    public Cliente() {

    }

    public Cliente(String nombre, String appellido, String numeroFiscal, String direccion, Integer clienteId) {
        super(nombre, appellido, numeroFiscal, direccion);
        this.clienteId = ++clienteId;
    }

    // Modificadores
    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + "Cliente ID: " + this.clienteId;
    }
}
