package com.uces.CopitoDeNieve.service;

import com.uces.CopitoDeNieve.model.Gusto;

import java.util.List;

public interface GustoService {

    List<Gusto> findAll();
    Gusto findGustoById(int id);
    List<Gusto> findByIdCategoria(int idCategoria);
    void save(Gusto gusto);
    void delete(Gusto gusto);

}
