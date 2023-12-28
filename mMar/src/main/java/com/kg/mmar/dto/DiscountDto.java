package com.kg.mmar.dto;

import com.kg.mmar.entity.Product;
import lombok.Data;

import java.time.LocalDateTime;

@Data

public class DiscountDto {
    private Long id;
    private Double discount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer daysCountForDiscount;
    private Product product;
}
