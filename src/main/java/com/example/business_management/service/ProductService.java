package com.example.business_management.service;

import com.example.business_management.dto.productDto.ProductRequestDto;
import com.example.business_management.dto.productDto.ProductResponseDto;
import com.example.business_management.mapper.ProductMapper;
import com.example.business_management.model.Product;
import com.example.business_management.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductResponseDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(x -> productMapper.toProductResponseDto(x))
                .collect(Collectors.toList());
    }

    public ProductResponseDto getProductById(Long id) throws RuntimeException {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product noy found: "));
        return productMapper.toProductResponseDto(product);
    }

    public boolean deleteProductById(long id) {
        return productRepository.deleteProductById(id);
    }

    public ProductResponseDto updateProductById(ProductRequestDto productRequestDto) {
        Product updatedProduct = productRepository.save();
        return productMapper.toProductResponseDto(updatedProduct);
    }
}
