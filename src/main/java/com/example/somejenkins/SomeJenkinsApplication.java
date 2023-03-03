package com.example.somejenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class SomeJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SomeJenkinsApplication.class, args);
    }

}
