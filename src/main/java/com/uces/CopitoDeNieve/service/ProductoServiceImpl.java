package com.uces.CopitoDeNieve.service;

import com.uces.CopitoDeNieve.dao.ProductoDao;
import com.uces.CopitoDeNieve.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> findAll() {

        return productoDao.findAll();
    }

    @Override
    public Producto findProductoById(int id) {
        return productoDao.findProductoById(id);
    }

    @Override
    public List<Producto> findProductoByName(String name) {
        return productoDao.findProductoByName(name);
    }

    @Override
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
}
