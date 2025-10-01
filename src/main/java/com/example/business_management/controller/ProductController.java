package com.example.business_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping()
    public String getAllProducts() {
        return "";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return "";
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Long id) {
        return "";
    }
}
