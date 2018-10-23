package com.uces.CopitoDeNieve.model;

public class Producto {

    private String nombre;
    private int cantidadGustos;
    private String descripcion;

    public Producto(String nombre, int cantidadGustos, String descripcion) {
        this.nombre = nombre;
        this.cantidadGustos = cantidadGustos;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadGustos() {
        return cantidadGustos;
    }

    public void setCantidadGustos(int cantidadGustos) {
        this.cantidadGustos = cantidadGustos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
