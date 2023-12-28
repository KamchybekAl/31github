package com.kg.mmar.service;

import com.kg.mmar.dto.DiscountDto;
import com.kg.mmar.entity.Discount;
import com.kg.mmar.entity.Product;

import java.util.List;

public interface DiscountService {
    DiscountDto saveDiscount(DiscountDto discountDto);

    DiscountDto findByIdDiscount(Long id);

    List<DiscountDto> findAllDiscount();

    DiscountDto updateDiscount(DiscountDto discountDto);

    void deleteDiscount(Long id);
    Discount getActualDiscountByProductAndDaysCount(Product product, Long daysCount);
}
