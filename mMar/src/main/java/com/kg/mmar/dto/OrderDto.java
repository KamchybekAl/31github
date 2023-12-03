package com.kg.mmar.dto;

import lombok.Data;

@Data
public class OrderDto {
    private Long id;
    private Boolean isPaid;
    private Double totalPrice;
}
