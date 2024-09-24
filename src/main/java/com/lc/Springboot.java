package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springboot.class, args);

        Object component1 = context.getBean("component1");
        System.out.println(component1);

    }
}
