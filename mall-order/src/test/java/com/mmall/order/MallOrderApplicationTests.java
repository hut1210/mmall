package com.mmall.order;

import com.mmall.order.bean.Cat;
import com.mmall.order.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class MallOrderApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        context.getBean(Cat.class);
    }

}
