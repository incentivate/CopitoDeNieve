package com.uces.CopitoDeNieve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    private int id;
    private String nombre;
    private int cantidadGustos;
    private String descripcion;

    public Producto(int id, String nombre, int cantidadGustos, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadGustos = cantidadGustos;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
