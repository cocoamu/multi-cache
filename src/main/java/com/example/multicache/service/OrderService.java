package com.example.multicache.service;

import com.example.multicache.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrderList();

    Order getOrderById(Long id);

    void addOrder(Order order);

    Order updateOrder(Order order);

    void deleteOrder(Long id);

    Order getOrderByIdAndStatus(Long id,Integer status);
}
