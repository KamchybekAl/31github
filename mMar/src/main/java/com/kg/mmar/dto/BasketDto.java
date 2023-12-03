package com.kg.mmar.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BasketDto {
    private Long id;
    private Double quantity;
    private LocalDate createdDate;


}
