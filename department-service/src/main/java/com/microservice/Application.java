package com.microservice;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
