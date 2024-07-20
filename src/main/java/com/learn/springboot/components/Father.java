package com.learn.springboot.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Father {
    final private Student student;

    public Father(@Qualifier("student2") Student student) {
        this.student = student;
    }

    public void useStudent(){
        log.info("using student");
        student.study();
    }

}
