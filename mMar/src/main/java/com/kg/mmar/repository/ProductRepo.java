package com.kg.mmar.repository;

import com.kg.mmar.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    @Query(value = "select * from product where product_category=:ProductCategory", nativeQuery = true)
    List<Product>getProductCategory(String ProductCategory);


}
