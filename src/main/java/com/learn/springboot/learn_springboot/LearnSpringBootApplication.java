package com.learn.springboot.learn_springboot;

import com.learn.springboot.learn_springboot.entities.Product;
import com.learn.springboot.learn_springboot.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication implements CommandLineRunner {

	private final ProductService productService;

    public LearnSpringBootApplication(ProductService productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Started...");
//		Product product = Product.builder()
//				.title("Samsung s23 Ultra")
//				.description("This is very good phone")
//				.price(140000)
//				.isLive(true)
//				.productId(1)
//				.build();
//		Product createdProduct = productService.createProduct(product);
//		System.out.println("Created Product: "+createdProduct);


//		productService.findAllProduct().forEach(System.out::println);
		Product product = productService.findById(2);
		System.out.println(product);


	}

}
