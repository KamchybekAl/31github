package com.kg.mmar.service.impl;

import com.kg.mmar.dto.PriceDto;
import com.kg.mmar.entity.Price;
import com.kg.mmar.mapper.PriceMapper;
import com.kg.mmar.repository.PriceRepo;
import com.kg.mmar.repository.ProductRepo;
import com.kg.mmar.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional

public class PriceServiceImpl implements PriceService {
    private final PriceRepo priceRepo;
    private final PriceMapper priceMapper;
    @Override
    public PriceDto savePrice(PriceDto priceDto) {
        Price price = priceMapper.toEntity(priceDto);
        Price save = priceRepo.save(price);
        return priceMapper.toDto(save);
    }

    @Override
    public PriceDto findByIdPrice(Long id) {
        return priceMapper.toDto(priceRepo.findById(id).get());
    }

    @Override
    public List<PriceDto> findAllPrice() {
        return priceMapper.toDtoList(priceRepo.findAll());
    }

    @Override
    public PriceDto updatePrice(PriceDto priceDto) {
        Price updateRr = priceRepo.findById(priceDto.getId()).get();
        updateRr.setPrice(priceDto.getPrice());
        updateRr.setStartDate(priceDto.getStartDate());
        updateRr.setEndTime(priceDto.getEndTime());
        return priceMapper.toDto(updateRr);
    }

    @Override
    public void deletePrice(Long id) {
        Price deletePrice = priceRepo.findById(id).get();
        priceRepo.delete(deletePrice);

    }
}
