package com.kg.mmar.service;

import com.kg.mmar.dto.BasketDto;

import java.util.List;

public interface BasketService {
    BasketDto saveBasket(BasketDto basketDto);
    BasketDto findByIdBasket(Long id);
    List<BasketDto> findAllBasket();
    BasketDto updateBasket(BasketDto basketDto);
    void deleteBasket(Long id);

}
