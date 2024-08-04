package com.learn.springboot.learn_springboot.dao.impl;

import com.learn.springboot.learn_springboot.dao.ProductDao;
import com.learn.springboot.learn_springboot.helper.ProductMapper;
import com.learn.springboot.learn_springboot.model.Product;
import com.learn.springboot.learn_springboot.model.ProductWithCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@Repository
public class ProductDaoImpl implements ProductDao {

    final private JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

        String createQuery = "CREATE TABLE IF NOT EXISTS products(id int primary key, title varchar(225) not null, description varchar(500) not null,price int not null, cat_id int, FOREIGN KEY (cat_id) REFERENCES category(id))";
        jdbcTemplate.update(createQuery);

    }

    @Override
    public Product create(Product product) {
        String query = "insert into products(id, title, description, price,cat_id) values(?, ?, ?, ?,?)";
        int rowAffected = jdbcTemplate.update(query, product.getId(), product.getTitle(), product.getDescription(), product.getPrice(),product.getCatId());
        log.info("{} row affected ",rowAffected);
        return product;
    }

    @Override
    public Product update(Product product, Integer productId) {
        String query = "update products set title = ?, description = ?, price = ?, where id = ?";
        int updatedRows = jdbcTemplate.update(query, product.getTitle(), product.getDescription(), product.getPrice(), productId);
        product.setId(productId);
        return product;
    }

    @Override
    public void delete(Integer productId) {
        String query = "delete from products where productId = ?";
        jdbcTemplate.update(query, productId);
    }

    @Override
    public List<Product> getAll() {
        String query = "select * from products";
        return jdbcTemplate.queryForList(query, Product.class);
    }

    public List<Product> getAll02() {
        String query = "select * from products";
        return jdbcTemplate.query(query, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                return Product.builder()
                        .id(rs.getInt("id"))
                        .title(rs.getString("title"))
                        .price(rs.getInt("price"))
                        .description(rs.getString("description"))
                        .build();

            }
        });
    }

    public List<Product> getAll03() {
        String query = "select * from products";
        return jdbcTemplate.query(query, (rs, rowNum)-> Product.builder()
                .id(rs.getInt("id"))
                .title(rs.getString("title"))
                .price(rs.getInt("price"))
                .description(rs.getString("description"))
                .build());
    }

    public List<Product> getAll04() {
        String query = "select * from products";
        return jdbcTemplate.query(query,new ProductMapper());
    }


    @Override
    public Product get(Integer productId) {
        String query = "select * from products where productId = ?";
//        jdbcTemplate.query()
        return jdbcTemplate.queryForObject(query, Product.class, productId);
    }

    @Override
    public List<Product> search(String keyword) {
        return List.of();
    }

    @Override
    public List<Product> getAllByCategory(Integer catId) {
        return List.of();
    }

    @Override
    public List<ProductWithCategory> getAllWithCategory() {

        String query = """
                select p.id as id, p.title as title, p.description as description,
                p.price as price, c.title as catTitle
                FROM products p INNER JOIN category c
                ON p.cat_id = c.id
                """;

        return jdbcTemplate.query(query, (rs, rowNum)->{
            return ProductWithCategory.builder()
                    .id(rs.getInt("id"))
                    .title(rs.getString("title"))
                    .description(rs.getString("description"))
                    .catTitle(rs.getString("catTitle"))
                    .build();
        });
    }




}
