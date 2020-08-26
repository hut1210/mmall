package com.mmall.system.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Mapper
@Component
public interface OrderMapper {
    /**
     * 插入订单
     * @param price
     * @param userId
     * @param status
     * @return
     */
    @Insert("insert into t_order(price,user_id,status) values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price") BigDecimal price, @Param("userId") long userId, @Param("status")Integer status);
}
