package com.example.business_management.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="product_name", nullable = false)
    private String name;

    @Column(name="product_price", nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
