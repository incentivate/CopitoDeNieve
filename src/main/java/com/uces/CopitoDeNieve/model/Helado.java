package com.uces.CopitoDeNieve.model;

public class Helado {

    private String tipo;
    private int idGusto;
    private int precio;

    public Helado(String tipo, int idGusto, int precio) {
        this.tipo = tipo;
        this.idGusto = idGusto;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdGusto() {
        return idGusto;
    }

    public void setIdGusto(int idGusto) {
        this.idGusto = idGusto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }





}
