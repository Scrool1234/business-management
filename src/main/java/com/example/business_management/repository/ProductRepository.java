package com.example.business_management.repository;

import com.example.business_management.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean deleteProductById(Long id);
}
