package com.mmall.order.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName(value = "o_order")
public class Order {

    @ApiModelProperty(value = "订单Id")
    private Long id;

    @ApiModelProperty(value = "订单描述")
    private String orderDescription;
}
