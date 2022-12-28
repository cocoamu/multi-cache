package com.example.multicache.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.multicache.annotation.MultiCache;
import com.example.multicache.constants.CacheType;
import com.example.multicache.entity.Order;
import com.example.multicache.mapper.OrderMapper;
import com.example.multicache.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;

    @Override
    @MultiCache(cacheName = "order", key = "#id",
            type = CacheType.FULL)
    public Order getOrderById(Long id) {
        Order myOrder = orderMapper.selectOne(new LambdaQueryWrapper<Order>()
                .eq(Order::getId, id));
        return myOrder;
    }

    @Override
    @MultiCache(cacheName = "order",key = "#order.id",
            type = CacheType.PUT)
    public Order updateOrder(Order order) {
        orderMapper.updateById(order);
        return order;
    }

    @Override
    @MultiCache(cacheName = "order",key = "#id",
            type = CacheType.DELETE)
    public void deleteOrder(Long id) {
        orderMapper.deleteById(id);
    }

    @Override
    @MultiCache(cacheName = "order",key = "#id")
    public Order getOrderByIdAndStatus(Long id,Integer status) {
        Order myOrder = orderMapper.selectOne(new LambdaQueryWrapper<Order>()
                .eq(Order::getId, id)
                .eq(Order::getStatus,status));
        return myOrder;
    }

    @Override
    public void addOrder(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public List<Order> getOrderList() {
        return orderMapper.selectList(null);
    }
}
