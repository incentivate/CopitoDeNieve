package com.uces.CopitoDeNieve.model;

public class Gusto {

    private int id;
    private String sabor;
    private String nombre;

    public Gusto(int id, String sabor, String nombre) {
        this.id = id;
        this.sabor = sabor;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
