package com.kg.mmar.service;

import com.kg.mmar.dto.DiscountDto;

import java.util.List;

public interface DiscountService {
    DiscountDto saveDiscount (DiscountDto discountDto);
    DiscountDto findByIdDiscount(Long id);
    List<DiscountDto> findAllDiscount();
    DiscountDto updateDiscount(DiscountDto discountDto);
    void deleteDiscount(Long id);
}
