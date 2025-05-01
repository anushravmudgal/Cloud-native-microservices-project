package com.example.Order_Service.controller;

import com.example.Order_Service.model.OrderEntity;
import com.example.Order_Service.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service){

        this.service=service;

    }
    @GetMapping

    // public String getUsers(){
    public List<OrderEntity> getUsers(){
        //  return "service is working";
        return service.getAll();


    }
    @PostMapping

    public OrderEntity create(@RequestBody OrderEntity order) {
        return service.create(order);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderEntity> getUserById(@PathVariable Long id) {
        OrderEntity user = service.getOrderById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


}

