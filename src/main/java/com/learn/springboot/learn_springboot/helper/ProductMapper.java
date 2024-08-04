package com.learn.springboot.learn_springboot.helper;

import com.learn.springboot.learn_springboot.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Product.builder()
                .id(rs.getInt("id"))
                .title(rs.getString("title"))
                .price(rs.getInt("price"))
                .description(rs.getString("description"))
                .build();
    }
}
