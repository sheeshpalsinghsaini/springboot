package com.learn.springboot.learn_springboot.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "jpa_product")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    @Column(name = "product_title", unique = true, nullable = false, length = 500)
    private String title;
    private String description;
    private double price;
    private boolean isLive = false;
}
