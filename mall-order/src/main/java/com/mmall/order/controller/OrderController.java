package com.mmall.order.controller;

import com.mmall.common.utils.BaseResultUtil;
import com.mmall.common.vo.PageVo;
import com.mmall.common.vo.ResultVo;
import com.mmall.order.dto.Order;
import com.mmall.order.feign.ProductService;
import com.mmall.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "订单服务接口",value = "订单服务")
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "获取单个订单详情")
    @GetMapping("/get/{id}")
    public ResultVo<Order> getOrderById(@PathVariable Long id){
        productService.test();
        return BaseResultUtil.success(orderService.getById(id));
    }

    @ApiOperation(value = "获取订单列表")
    @GetMapping("/getOrderList")
    public ResultVo<PageVo<Order>> getOrderList(){
        return orderService.getOrderList();
    }
}
