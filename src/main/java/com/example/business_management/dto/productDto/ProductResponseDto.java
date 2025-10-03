package com.example.business_management.dto.productDto;

import com.example.business_management.model.User;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponseDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private User user;
}
