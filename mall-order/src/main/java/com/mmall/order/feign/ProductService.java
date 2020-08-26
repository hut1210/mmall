package com.mmall.order.feign;

import com.mmall.order.config.ProductServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "product", fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductService {

    @RequestMapping("/test")
    String test();
}
