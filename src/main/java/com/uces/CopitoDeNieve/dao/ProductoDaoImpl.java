package com.uces.CopitoDeNieve.dao;

import com.uces.CopitoDeNieve.model.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDaoImpl implements ProductoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Producto> findAll() {
        // Open a session
        Session session = sessionFactory.openSession();

        // Get all Gustos with a "Hibernate Criteria Object"
        List<Producto> allProductos = session.createCriteria(Producto.class).list();

        // Close the session
        session.close();

        return allProductos;
    }

    @Override
    public List<Producto> findAllProductosByName(String name) {

        Session session = sessionFactory.openSession();
        List<Producto> productos = new ArrayList<>();
        for(Producto producto : findAll()){
            if(producto.getNombre().equals(name)){
                 productos.add(producto);
            }
        }
        return productos;
    }

    @Override
    public Producto findProductoById(int id) {
        Session session = sessionFactory.openSession();
        for(Producto producto : findAll()){
            if(producto.getId() == id){
                return producto;
            }
        }
        return null;
    }

    @Override
    public void save(Producto producto) {
        // Open a Session
        Session session = sessionFactory.openSession();

        // Begin transaction
        session.beginTransaction();

        // Use the session to save the object
        int id = (int)session.save(producto);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
    }

    @Override
    public void delete(Producto producto) {
        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        session.beginTransaction();

        // Use the session to update the contact
        session.delete(producto);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
    }
}
