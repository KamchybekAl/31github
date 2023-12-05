package com.kg.mmar.service;

import com.kg.mmar.dto.PriceDto;

import java.util.List;

public interface PriceService {
    PriceDto savePrice (PriceDto priceDto);
    PriceDto findByIdPrice (Long id);
    List<PriceDto>findAllPrice();
    PriceDto updatePrice(PriceDto priceDto);
    void deletePrice(Long id);


}
