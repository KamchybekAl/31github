package com.kg.mmar.service.impl;

import com.kg.mmar.dto.DiscountDto;
import com.kg.mmar.entity.Discount;
import com.kg.mmar.entity.Product;
import com.kg.mmar.mapper.DiscountMapper;
import com.kg.mmar.repository.DiscountRepo;
import com.kg.mmar.repository.ProductRepo;
import com.kg.mmar.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional

public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepo discountRepo;
    private final DiscountMapper discountMapper;
    private final ProductRepo productRepo;

    @Override
    public DiscountDto saveDiscount(DiscountDto discountDto) {
        Discount discount = discountMapper.toEntity(discountDto);
        discount.setStartDate(LocalDateTime.now());
        discount.setEndDate(discount.getStartDate().plusYears(100));
        discount.setProduct(productRepo.findById(discountDto.getProduct().getId()).get());
        Discount save = discountRepo.save(discount);
        return discountMapper.toDto(save);
    }

    @Override
    public DiscountDto findByIdDiscount(Long id) {
        return discountMapper.toDto(discountRepo.findById(id).get());
    }

    @Override
    public List<DiscountDto> findAllDiscount() {
        return discountMapper.toDtoList(discountRepo.findAll());
    }

    @Override
    public DiscountDto updateDiscount(DiscountDto discountDto) {
        Discount updateDs = discountRepo.findById(discountDto.getId()).get();
        updateDs.setDiscount(discountDto.getDiscount());
        updateDs.setStartDate(discountDto.getStartDate());
        updateDs.setEndDate(discountDto.getEndDate());
        updateDs.setDaysCountForDiscount(discountDto.getDaysCountForDiscount());
        return discountMapper.toDto(updateDs);
    }

    @Override
    public void deleteDiscount(Long id) {
        Discount deleteDs = discountRepo.findById(id).get();
        discountRepo.delete(deleteDs);
    }

    @Override
    public Discount getActualDiscountByProductAndDaysCount(Product product, Long daysCount) {
        return discountRepo.getActualDiscount(product.getId(),daysCount);
    }


}
