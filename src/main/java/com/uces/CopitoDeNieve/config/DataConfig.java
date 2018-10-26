package com.uces.CopitoDeNieve.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;


@Configuration
@PropertySource("app.properties")
public class DataConfig {
    @Autowired
    private Environment env;

    @Bean
    // LocalSessionFactoryBean = Un SessionFactory de Hibernate, solo que en spring se llama así
    public LocalSessionFactoryBean sessionFactory(){
        Resource config = new ClassPathResource("hibernate.cfg.xml");
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setConfigLocation(config);
        // el getProperty trae las propiedades de app.properties con el nombre especificado como String
        // el setPackagesToScan escanea las app.properties cuando bootea
        sessionFactory.setPackagesToScan(env.getProperty("copito.entity.package"));
        sessionFactory.setDataSource(dataSource());
        return sessionFactory;
    }

    @Bean
    // Method that handles DataBase connection pooling
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();

        // Driver class name
        ds.setDriverClassName(env.getProperty("copito.db.driver"));

        // Set url
        ds.setUrl(env.getProperty("copito.db.url"));

        // Set username and password
        ds.setUsername(env.getProperty("copito.db.username"));
        ds.setPassword(env.getProperty("copito.db.password"));

        return ds;
    }
}
