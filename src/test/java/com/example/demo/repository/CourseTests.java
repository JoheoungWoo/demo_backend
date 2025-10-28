package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class CourseTests {
    @Autowired
    CourseRepository repository;

    @Test
    public void findAllTest() {
        for(Course course : repository.findAll()) {
            System.out.println("course : " + course);
        }
    }

}
