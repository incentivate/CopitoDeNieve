package com.uces.CopitoDeNieve.dao;

import com.uces.CopitoDeNieve.model.Producto;

import java.util.List;

public interface ProductoDao {

    List<Producto> findAll();
    Producto findProductoById(int id);
    List<Producto> findProductoByName(String name);
    void save(Producto producto);
    void delete(Producto producto);

}
