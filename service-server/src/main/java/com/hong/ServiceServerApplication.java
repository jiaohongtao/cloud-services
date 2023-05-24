package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceServerApplication.class, args);
    }

}
