package com.mmall.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mmall.order.dto.Order;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {
    List<Order> getOrderList();
}
