package com.example.multicache.controller;

import com.example.multicache.entity.Order;
import com.example.multicache.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PutMapping("add")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }

    @GetMapping("get")
    public List<Order> getList(){
        return orderService.getOrderList();
    }

    @GetMapping("get/{id}")
    public Order get(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }

    @PostMapping("update")
    public void updateOrder(@RequestBody Order order){
        orderService.updateOrder(order);
    }

    @DeleteMapping("del")
    public void del(@RequestParam("id") Long id){
        orderService.deleteOrder(id);
    }

}