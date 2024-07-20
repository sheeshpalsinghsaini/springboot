package com.learn.springboot;

import com.learn.springboot.components.Car;
import com.learn.springboot.components.Wheel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication
@ImportResource("classpath:static/config.xml")
public class LearnSpringBootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootApplication.class, args);
		Wheel wheelBean = applicationContext.getBean(Wheel.class);
		Car carBean = applicationContext.getBean(Car.class);
		log.info("Bean is getting successfully : {}",wheelBean);
		log.info("Bean is getting successfully : {}",carBean);



	}

}
