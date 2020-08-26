package com.mmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mmall.common.vo.PageVo;
import com.mmall.common.vo.ResultVo;
import com.mmall.order.dto.Order;

public interface OrderService extends IService<Order> {
    ResultVo<PageVo<Order>> getOrderList();
}
