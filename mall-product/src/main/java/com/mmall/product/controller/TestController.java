package com.mmall.product.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Api(tags = "product test")
public class TestController {
    @Value("${product.username}")
    private String username;

    @Value("${product.age}")
    private int age;

    @GetMapping("/test")
    public String test(){
        return "product get username="+username+" age="+age;
    }
}
