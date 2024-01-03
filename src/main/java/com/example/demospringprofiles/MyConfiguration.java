package com.example.demospringprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mydatasource.properties")
public class MyConfiguration {

    @Bean
    public MyDataSource myDataSource(@Value("${mydatasource.username}") String username,
                                     @Value("${mydatasource.password}") String password) {

        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setUsername(username);
        myDataSource.setPassword(password);

        System.out.println("username: " + myDataSource.getUsername());
        System.out.println("password: " + myDataSource.getPassword());
        return myDataSource;
    }

}
