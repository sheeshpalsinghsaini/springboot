package com.learn.springboot;

import com.learn.springboot.components.Father;
import com.learn.springboot.controller.HomeController;
import dummy.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = {"dummy","com.learn.springboot"})
public class LearnSpringBootApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
//		Car carBean = context.getBean(Car.class);
//		log.info("Car object : {}",carBean);

//		Father fatherBean = context.getBean("father",Father.class);
//		fatherBean.useStudent();

//		HomeController homeController = context.getBean(HomeController.class);
//		homeController.loginUser();

		Car carBean1 = context.getBean(Car.class);
		Car carBean2 = context.getBean(Car.class);

		System.out.println("car1 "+carBean1);
		System.out.println("car1 "+carBean2);


	}
}
