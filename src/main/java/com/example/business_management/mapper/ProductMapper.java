package com.example.business_management.mapper;

import com.example.business_management.dto.productDto.ProductRequestDto;
import com.example.business_management.dto.productDto.ProductResponseDto;
import com.example.business_management.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponseDto toProductResponseDto(Product product);
    Product toProduct(ProductResponseDto productResponseDto);

    ProductRequestDto toProductRequestDto(Product product);
    Product toProduct(ProductRequestDto productRequestDto);
}
