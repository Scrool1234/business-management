package com.example.business_management.controller;

import com.example.business_management.dto.productDto.ProductResponseDto;
import com.example.business_management.repository.ProductRepository;
import com.example.business_management.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    private final ProductRepository productRepository;

    @GetMapping()
    public String getAllProducts() {
        List<ProductResponseDto> products = productService.getAllProducts();
        return "";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        ProductResponseDto productResponseDto = productService.getProductById(id);
        return "";
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") Long id) {
        Boolean isDeleted = productService.deleteProductById(id);
    }
}
