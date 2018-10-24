package com.uces.CopitoDeNieve.model;

import javax.persistence.*;

@Entity // opcional (name="") ---> Si se usa la tabla llevará el nombre especificado
public class Gusto {

    @Id // hace que el atributo sea clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String sabor;

    @Column // opcional (name="")
    private String nombre;

    public Gusto(){

    }

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

    @Override
    public String toString(){
        return this.id + " " + this.sabor + " " + this.nombre ;
    }
}
