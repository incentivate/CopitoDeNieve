package com.uces.CopitoDeNieve.service;

import com.uces.CopitoDeNieve.dao.GustoDao;
import com.uces.CopitoDeNieve.model.Gusto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GustoServiceImpl implements GustoService {
    @Autowired
    private GustoDao gustoDao;


    @Override
    public List<Gusto> findAll(){

        return gustoDao.findAll();
    }

    @Override
    public Gusto findGustoById(int id){

        return gustoDao.findGustoById(id);
    }

    @Override
    public List<Gusto> findByIdCategoria(int idCategoria){

        return gustoDao.findByIdCategoria(idCategoria);
    }

    @Override
    public void save(Gusto gusto){
        gustoDao.save(gusto);
    }

    @Override
    public void update(Gusto gusto){
        gustoDao.update(gusto);
    }

    @Override
    public void delete(Gusto gusto){
        gustoDao.delete(gusto);
    }

}
