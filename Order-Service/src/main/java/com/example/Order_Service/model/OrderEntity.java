package com.example.Order_Service.model;

import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.azure.spring.data.cosmos.core.mapping.Container;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Container(containerName = "orders")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue
    private String id;

    @PartitionKey
    private String userId;

    private String product;
    private int quantity;
    private double price;

}
