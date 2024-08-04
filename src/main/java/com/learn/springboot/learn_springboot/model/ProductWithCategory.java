package com.learn.springboot.learn_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductWithCategory {
    private Integer id;
    private String title;
    private String description;
    private String catTitle;
}
