package com.uces.CopitoDeNieve.service;

import com.uces.CopitoDeNieve.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> findAll();
    Producto findProductoById(int id);
    List<Producto> findAllProductosByName(String name);
    void save(Producto producto);
    void delete(Producto producto);

}
