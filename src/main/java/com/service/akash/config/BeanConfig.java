package com.service.akash.config;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.sql.DataSource;

@EnableConfi
@Configuration
public class BeanConfig {

    @Bean
    public DataSource getDataSource(){
        DataSourceBuilder dataSource =  DataSourceBuilder.create();
        dataSource.username("sa");
        dataSource.password("password");
        dataSource.url("jdbc:h2:mem:dcbapp");
        dataSource.driverClassName("org.h2.Driver");


        System.out.println("\n ***** Creating the H2 DataSource Bean *******\n");
        return dataSource.build();
    }


}
