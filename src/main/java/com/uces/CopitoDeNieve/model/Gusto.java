package com.uces.CopitoDeNieve.model;

import javax.persistence.*;

@Entity // opcional (name="") ---> Si se usaz la tabla llevará el nombre especificado
public class Gusto {

    @Id // hace que el atributo sea clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Integer idCategoria;

    @Column
    private String categoria;

    @Column // opcional (name="")
    private String nombre;

    public Gusto(){

    }

    // 1) Dulce de leche      2) Cremas       3) Chocolates      4) Frutales
    public Gusto(int id, int idCategoria, String categoria, String nombre) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return this.id + " " + this.categoria + " " + this.nombre ;
    }
}
