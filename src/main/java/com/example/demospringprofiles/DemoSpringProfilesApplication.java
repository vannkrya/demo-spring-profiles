package com.example.demospringprofiles;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringProfilesApplication implements CommandLineRunner {

    private final Animal animal;

    public DemoSpringProfilesApplication(Animal animal) {
        this.animal = animal;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringProfilesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("animal: " + animal);
        animal.makeSound();
    }

}

