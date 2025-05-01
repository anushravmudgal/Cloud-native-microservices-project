package com.example.User_Service.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="addresses")
@Data
public class AddressEntity {
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;





}
