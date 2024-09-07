package com.learn.springboot.learn_springboot.services;

import com.learn.springboot.learn_springboot.repository.ProductRepository;
import com.learn.springboot.learn_springboot.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // create product
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    // find all
    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    // find by id
    public Product findById(int id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id : "+id));
    }

    // delete product
    public void delete(int productId){
        Product product = productRepository.findById(productId).orElse(new Product());
        productRepository.delete(product);
    }

}
