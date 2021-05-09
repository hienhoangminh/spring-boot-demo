package com.hienhoang.springbascis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbascisApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringbascisApplication.class, args);
        var car = applicationContext.getBean(Car.class);
        car.getCar();
    }

}
