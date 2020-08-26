package com.mmall.order;

import com.mmall.order.mapper.Order2Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest(classes = {MallOrderApplication.class})
public class OrderTest {

    @Autowired
    private Order2Mapper order2Mapper;

    @Test
    public void testInsertOrder(){
        order2Mapper.insertOrder(new BigDecimal(11),1L,1);
    }
}
