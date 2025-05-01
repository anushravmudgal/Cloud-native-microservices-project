package com.example.Order_Service.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.example.Order_Service.model.OrderEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CosmosRepository<OrderEntity, Long> {
}


