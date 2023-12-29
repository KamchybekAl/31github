package com.kg.mmar.service;

import com.kg.mmar.dto.BasketDto;
import com.kg.mmar.entity.Basket;

import java.util.List;

public interface BasketService {
    Basket saveBasket(Basket basket);
    Basket findByIdBasket(Long id);
    List<BasketDto> findAllBasket();
    BasketDto updateBasket(BasketDto basketDto);
    void deleteBasket(Long id);

}
