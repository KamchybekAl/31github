package com.kg.mmar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kg.mmar.entity.Product;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceDto {
    private Long id;
    private Double price;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime startDate;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime endTime;
    private Product product;
}
