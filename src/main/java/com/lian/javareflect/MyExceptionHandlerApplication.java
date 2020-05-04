package com.lian.javareflect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyExceptionHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyExceptionHandlerApplication.class, args);
    }

}
