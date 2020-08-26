package com.mmall.system;

import com.mmall.system.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MallSystemApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsertOrder(){
        for(int i=1;i<10;i++){
            orderMapper.insertOrder(new BigDecimal(11),1L,1);
        }

    }

}
