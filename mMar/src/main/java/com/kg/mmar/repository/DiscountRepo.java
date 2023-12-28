package com.kg.mmar.repository;

import com.kg.mmar.entity.Discount;
import com.kg.mmar.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscountRepo extends JpaRepository<Discount,Long> {
    Optional<Discount>findByProduct(Product product);
    @Query(value = "select * from discount where product_id = ?1 and days_count_for_discount <= ?2 and end_date > now() order by days_count_for_discount desc limit  1",nativeQuery = true)
    Discount getActualDiscount(Long productId, Long daysCount);
}
