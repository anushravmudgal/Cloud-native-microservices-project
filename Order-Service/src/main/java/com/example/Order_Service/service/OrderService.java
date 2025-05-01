package com.example.Order_Service.service;

import com.example.Order_Service.model.OrderEntity;
import com.example.Order_Service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private final OrderRepository repo;

    public OrderService(OrderRepository repo){
        this.repo = repo;

    }

    public List<OrderEntity> getAll(){
        return (List<OrderEntity>) repo.findAll();
    }

    public OrderEntity create(OrderEntity order){
        return repo.save(order);
    }

    public OrderEntity getOrderById(Long id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));

    }

}
