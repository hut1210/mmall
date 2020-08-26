package com.mmall.order.controller;

import com.mmall.order.feign.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RefreshScope
public class TestController {

    @Value("${order.username}")
    private String username;

    @Value("${order.age}")
    private int age;

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "order get username="+username+" age="+age;
    }

    @GetMapping("/testProduct")
    @ResponseBody
    public String testProduct(){
        return productService.test();
    }
}
