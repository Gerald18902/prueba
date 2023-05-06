package com.apiprueba.prueba.entity;

public class Animal {

    private String nombre;
    private String tipo;
    private String nro_patas;

    public Animal(String tipo, String nro_patas, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.nro_patas = nro_patas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNro_patas() {
        return nro_patas;
    }

    public void setNro_patas(String nro_patas) {
        this.nro_patas = nro_patas;
    }

    @Override
    public String toString() {
        return "Soy un animal + "+this.nombre;
    }
    
    
    
}
