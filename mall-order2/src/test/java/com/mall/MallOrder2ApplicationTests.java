package com.mall;

import com.mall.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MallOrder2ApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsertOrder(){
        for(int i=0;i<10;i++){
            orderMapper.insertOrder(new BigDecimal(11),Long.valueOf(i),1,System.currentTimeMillis());
        }
    }
    @Test
    public void testSelectOrderByIds(){
        List<Long> orderIds = new ArrayList<Long>();
        orderIds.add(499581379525214209L);
        orderIds.add(499581379881730048L);
        List<Map> maps = orderMapper.selectOrderByIds(orderIds);
        System.out.println(maps);
    }

}
