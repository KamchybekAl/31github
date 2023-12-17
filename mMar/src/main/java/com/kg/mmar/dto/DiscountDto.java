package com.kg.mmar.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class DiscountDto {
    private Long id;
    private Double discount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer daysCount;
}
