package com.orderservice.api.controller;

import com.orderservice.api.entity.Order;
import com.orderservice.api.repository.OrderRepository;
import com.orderservice.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @PostMapping("/bookOrder")
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
}
