package com.example.business_management.dto.productDto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDto {
    private String name;
    private BigDecimal price;
}
