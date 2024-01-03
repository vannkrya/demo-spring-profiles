package com.example.demospringprofiles;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
@Profile("cat")
@Component
public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Maew maew....");
    }
}
