package com.mmall.order.config;

import com.mmall.order.feign.ProductService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {
    @Override
    public ProductService create(Throwable throwable) {
        return new ProductService() {
            @Override
            public String test() {
                return "服务异常演习专用！";
            }
        };
    }
}
