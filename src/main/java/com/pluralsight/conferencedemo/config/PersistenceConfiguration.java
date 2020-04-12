// Commented to REMOVE CREDENTIALS TO DB

//package com.pluralsight.conferencedemo.config;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import javax.sql.DataSource;
//
//@Configuration
//public class PersistenceConfiguration {
//
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        System.out.println("My custom datasource bean has been initialized and set");
//        return builder.build();
//    }
//}
