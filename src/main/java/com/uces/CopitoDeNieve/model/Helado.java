package com.uces.CopitoDeNieve.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Helado {
    @Id
    private int id;
    private String tipo;
    @OneToMany
    private List<Gusto> gustos;
    private int precio;

    public Helado(){

    }

    public Helado(int id, String tipo, List<Gusto> gustos, int precio) {
        this.id = id;
        this.tipo = tipo;
        this.gustos = gustos;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Gusto> getGustos() {
        return gustos;
    }

    public void setGustos(List<Gusto> gustos) {
        this.gustos = gustos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
