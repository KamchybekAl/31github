package com.kg.mmar.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "basket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double quantity;
    private LocalDate createdDate;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product>productList;
    @OneToOne
    @JoinColumn(name = "user_info_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
