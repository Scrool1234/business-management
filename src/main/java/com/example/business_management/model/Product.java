package com.example.business_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="product_name")
    private String name;

    @Column(name="product_price")
    private BigDecimal price;
}
