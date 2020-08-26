package com.mall;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class MallOrder2Application {

    public static void main(String[] args) {
        SpringApplication.run(MallOrder2Application.class, args);
    }

}
