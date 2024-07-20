package com.learn.springboot.components;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("student1")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Slf4j
public class Student {
    private String stuName="default";
    private String stuRollNo;

    public void study(){
        log.info("Student is studying : {}",stuName);
    }
}
