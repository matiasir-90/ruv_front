package com.ruv_front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("http:\\localhotst:8181")
public class ruv_front {

    public static void main(String[] args) {
        SpringApplication.run(ruv_front.class, args);
    }
}
