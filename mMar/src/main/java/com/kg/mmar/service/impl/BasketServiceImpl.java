package com.kg.mmar.service.impl;

import com.kg.mmar.dto.BasketDto;
import com.kg.mmar.entity.Basket;
import com.kg.mmar.mapper.BasketMapper;
import com.kg.mmar.repository.BasketRepo;
import com.kg.mmar.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class BasketServiceImpl implements BasketService {

    private final BasketRepo basketRepo;
    private final BasketMapper basketMapper;
    @Override
    public Basket saveBasket(Basket basket) {
//        Basket basket =basketMapper.toEntity(basket);
        return basketRepo.save(basket);

    }

    @Override
    public Basket findByIdBasket(Long id) {
        return basketRepo.findById(id).get();
    }

    @Override
    public List<BasketDto> findAllBasket() {
        return basketMapper.toDtoList(basketRepo.findAll());
    }

    @Override
    public BasketDto updateBasket(BasketDto basketDto) {
        Basket updateBasketBas = basketRepo.findById(basketDto.getId()).get();
        updateBasketBas.setQuantity(basketDto.getQuantity());
        updateBasketBas.setCreatedDate(basketDto.getCreatedDate());
        return basketMapper.toDto(updateBasketBas);
    }

    @Override
    public void deleteBasket(Long id) {
        Basket deleteBasket = basketRepo.findById(id).get();
        basketRepo.delete(deleteBasket);
    }
}
