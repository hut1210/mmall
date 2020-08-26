package com.mmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mmall.common.utils.BaseResultUtil;
import com.mmall.common.vo.PageVo;
import com.mmall.common.vo.ResultVo;
import com.mmall.order.dto.Order;
import com.mmall.order.mapper.OrderMapper;
import com.mmall.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    
    @Resource
    private OrderMapper orderMapper;
    @Override
    public ResultVo<PageVo<Order>> getOrderList() {
        PageHelper.startPage(1,10);
        List<Order> list = orderMapper.getOrderList();
        PageInfo<Order> pageInfo = new PageInfo<>(list);
        return BaseResultUtil.success(pageInfo);
    }
}
