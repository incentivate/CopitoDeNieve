package com.uces.CopitoDeNieve.dao;

import com.uces.CopitoDeNieve.model.Gusto;

import java.util.List;

public interface GustoDao {

    List<Gusto> findAll();
    Gusto findGustoById(int id);
    List<Gusto> findByIdCategoria(int idCategoria);
    void save(Gusto gusto);
    void update(Gusto gusto);
    void delete(Gusto gusto);
}
