package com.example.demo.repository;

import com.example.demo.entity.Timetable;
import com.example.demo.entity.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class TimetableTests {
    @Autowired
    TimeableRepository repository;

    @Test
    public void findAllTest() {
        for(Timetable timetable : repository.findAll()) {
            System.out.println("timetable : " + timetable);
        }
    }

}
