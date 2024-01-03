package com.example.demospringprofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dog")
@Component
public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("wooh wooh...");
    }
}
