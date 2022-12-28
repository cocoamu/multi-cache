package com.example.multicache.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.multicache.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
