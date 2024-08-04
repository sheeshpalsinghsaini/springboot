package com.learn.springboot.learn_springboot;

import com.learn.springboot.learn_springboot.dao.CategoryDao;
import com.learn.springboot.learn_springboot.dao.ProductDao;
import com.learn.springboot.learn_springboot.model.Category;
import com.learn.springboot.learn_springboot.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootApplication.class, args);



		ProductDao productDao = applicationContext.getBean(ProductDao.class);
		CategoryDao categoryDao = applicationContext.getBean(CategoryDao.class);



//		Category categoryItem = Category.builder()
//				.id(1001)
//				.title("mobile")
//				.description("mobile phones")
//				.build();
//		categoryDao.create(categoryItem);

		// product create
//		Product product = Product.builder()
//				.id(102)
//				.title("Iphone 14")
//				.description("Best  IPhone")
//				.price(124000)
//				.catId(categoryItem.getId())
//				.build();
//		Product product1 = productDao.create(product);

//		System.out.println(product1);

		productDao.getAllWithCategory().forEach(System.out::println);

	}

}
