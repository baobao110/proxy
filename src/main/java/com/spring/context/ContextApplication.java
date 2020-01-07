package com.spring.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class ContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);
    }

}
