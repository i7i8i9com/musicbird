package com.i7i8i9.musicbird1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Musicbird1Application {

    public static void main(String[] args) {
        SpringApplication.run(Musicbird1Application.class, args);
    }

}
