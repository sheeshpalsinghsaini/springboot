package com.learn.springboot.learn_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class Product {
    private Integer id;
    private String title;
    private String description;
    private Integer price;
    private int catId;
}
