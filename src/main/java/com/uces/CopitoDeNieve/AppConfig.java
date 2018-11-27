package com.uces.CopitoDeNieve;


import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        // Create a StandardServiceRegistry
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static void main(String[] args) {
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

    }
}



