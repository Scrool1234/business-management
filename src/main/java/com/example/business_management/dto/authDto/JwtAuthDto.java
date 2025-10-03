package com.example.business_management.dto.authDto;

import lombok.Data;

@Data
public class JwtAuthDto {
    private String jwtToken;
    private String refreshToken;
}
