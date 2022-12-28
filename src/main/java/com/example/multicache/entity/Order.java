package com.example.multicache.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName(value = "t_order")
public class Order {

    @TableId(value = "id")
    Long id;

    @TableField("order_number")
    String orderNumber;

    Double money;

    Integer status;
}