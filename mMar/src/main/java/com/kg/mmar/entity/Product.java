package com.kg.mmar.entity;

import com.kg.mmar.entity.enams.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameOfProduct;
    private String brand;
    private Double weight;
    private Double availableQuantity;
    private Boolean isActual;
    @Enumerated(value = EnumType.STRING)
    private ProductCategory productCategory;

}
