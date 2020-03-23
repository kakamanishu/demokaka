package com.example.demokaka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demokaka")
@MapperScan(basePackages = "com.example.demokaka.mapper")
public class DemokakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemokakaApplication.class, args);
    }

}
