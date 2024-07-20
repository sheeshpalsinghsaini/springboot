package com.learn.springboot.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("student2")
    public Student student2(){
        return Student.builder().stuName("student2").build();
    }

    @Bean("student3")
    public Student student3(){
        return Student.builder().stuName("student3").build();
    }
}
