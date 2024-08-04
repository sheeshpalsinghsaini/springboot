package com.learn.springboot.learn_springboot.dao;

import com.learn.springboot.learn_springboot.model.Product;
import com.learn.springboot.learn_springboot.model.ProductWithCategory;

import java.util.List;

public interface ProductDao {
    // save product
    Product create(Product product);
    // update product
    Product update(Product product, Integer productId);

    // delete product
    void delete(Integer productId);

    // get all product
    List<Product> getAll();

    // get single product
    Product get(Integer productId);

    // search product
    List<Product> search(String keyword);



    // get all product of category
    List<Product> getAllByCategory(Integer catId);

    // get all with category
    List<ProductWithCategory> getAllWithCategory();
}
