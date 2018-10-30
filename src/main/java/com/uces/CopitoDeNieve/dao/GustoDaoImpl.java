package com.uces.CopitoDeNieve.dao;

import com.uces.CopitoDeNieve.model.Gusto;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // para que Spring sepa que es una implementación de GustoDao
public class GustoDaoImpl implements GustoDao {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Gusto> findAll(){
        // Open a session
        Session session = sessionFactory.openSession();

        // Get all Gustos with a "Hibernate Criteria Object"
        List<Gusto> allGustos = session.createCriteria(Gusto.class).list();

        // Close the session
        session.close();

        return allGustos;
    }

    @Override
    public Gusto findGustoById(int id){
        Session session = sessionFactory.openSession();
        // Get's the id column from the specified class ! (find out what's the diff with Criteria :/)
        Gusto gusto = session.get(Gusto.class, id);
        session.close();
        return gusto;
    }

    @Override
    public List<Gusto> findByIdCategoria(int idCategoria){
        return null;
    }


    @Override
    public void save(Gusto gusto){
        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        session.beginTransaction();

        // Save Gusto
        session.save(gusto);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
    }

    @Override
    public void delete(Gusto gusto){
        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        session.beginTransaction();

        // Use the session to delete the Gusto
        session.delete(gusto);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
    }


} // class end !
