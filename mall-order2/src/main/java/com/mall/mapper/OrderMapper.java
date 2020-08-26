package com.mall.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface OrderMapper {
    /**
     * 插入订单
     * @param price
     * @param userId
     * @param status
     * @param createTime
     * @return
     */
    @Insert("insert into t_order(price,user_id,status,create_time) values(#{price},#{userId},#{status},#{createTime})")
    int insertOrder(@Param("price") BigDecimal price, @Param("userId") long userId, @Param("status") Integer status,@Param("createTime") long createTime);


    /**
     * 查询订单
     * @param orderIds
     * @return
     */
    @Select("<script>select * from t_order t where t.order_id in"+
            "<foreach collection='orderIds' open='(' separator=',' close=')' item='id'>"+
            "#{id} </foreach> </script>")
    List<Map> selectOrderByIds(@Param("orderIds") List<Long> orderIds);
}
