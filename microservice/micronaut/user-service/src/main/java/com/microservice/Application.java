package com.microservice;

import io.micronaut.runtime.Micronaut;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
