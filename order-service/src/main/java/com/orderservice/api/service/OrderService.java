package com.orderservice.api.service;

import com.orderservice.api.entity.Order;
import com.orderservice.api.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order saveOrder( Order order){
       return orderRepo.save(order);
    }
}
