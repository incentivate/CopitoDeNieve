package com.uces.CopitoDeNieve;

import com.uces.CopitoDeNieve.model.Gusto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        // Create a StandardServiceRegistry
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static void main(String[] args){
        SpringApplication.run(AppConfig.class, args);

//        Gusto gusto = new Gusto(1, "Dulce de Leche", "Dulce de leche comun");
//
//        int id = save(gusto);
//        // Display a list of Gustos before the update
//        fetchAllGustos().stream().forEach(System.out::println);
//
//        // Get the persisted Gusto
//        Gusto g = findGustoById(id);
//
//        // Update the contact
//        g.setNombre("Dulce de leche deja de ser comun");
//
//        // Persist the changes
//        update(g);
//
//        // Display a list of contacts after the update
//        fetchAllGustos().stream().forEach(System.out::println);
//
//        // Get the contact with id of 14
//        g = findGustoById(14);
//
//        // Delete the contact
//        delete(g);
//        fetchAllGustos().stream().forEach(System.out::println);

    }

//    private static int save(Gusto gusto){
//
//        // Open a Session
//        Session session = sessionFactory.openSession();
//
//        // Begin transaction
//        session.beginTransaction();
//
//        // Use the session to save the object
//        int id = (int)session.save(gusto);
//
//        // Commit the transaction
//        session.getTransaction().commit();
//
//        // Close the session
//        session.close();
//
//        return id;
//    }
//
//    @SuppressWarnings("unchecked")
//    private static List<Gusto> fetchAllGustos(){
//        // Open a session
//        Session session = sessionFactory.openSession();
//
//        // Create Criteria
//        Criteria criteria = session.createCriteria(Gusto.class);
//
//        // Get a List of Gustos according to the Criteria object
//        List<Gusto> gustos = criteria.list();
//
//        // Close the session
//        session.close();
//
//        return gustos;
//    }
//
//    private static Gusto findGustoById(int id){
//        // Open a session
//        Session session = sessionFactory.openSession();
//
//        // Retrieve the persistent object (or null if not found)
//        Gusto gusto = session.get(Gusto.class, id);
//
//        // Close the session
//        session.close();
//
//        // Return the object
//        return gusto;
//    }
//
//    private static void update(Gusto gusto){
//        // Open a session
//        Session session = sessionFactory.openSession();
//
//        // Begin a transaction
//        session.beginTransaction();
//
//        // Use the session to update the contact
//        session.update(gusto);
//
//        // Commit the transaction
//        session.getTransaction().commit();
//
//        // Close the session
//        session.close();
//    }
//
//    private static void delete(Gusto gusto) {
//        // Open a session
//        Session session = sessionFactory.openSession();
//
//        // Begin a transaction
//        session.beginTransaction();
//
//        // Use the session to update the contact
//        session.delete(gusto);
//
//        // Commit the transaction
//        session.getTransaction().commit();
//
//        // Close the session
//        session.close();
//    }

}
