package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class UserTests {
    @Autowired
    UserRepository repository;

    @Test
    public void findAllTest() {
        for(User user : repository.findAll()) {
            System.out.println("user : " + user);
        }
    }

}
