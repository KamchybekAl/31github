package com.kg.mmar.repository;

import com.kg.mmar.entity.Price;
import com.kg.mmar.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriceRepo extends JpaRepository<Price,Long> {
//    Optional<Price>findByProduct(Product product);
}
