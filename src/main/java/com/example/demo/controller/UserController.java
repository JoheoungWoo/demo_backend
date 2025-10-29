package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
@Slf4j
@CrossOrigin(
        origins = {"http://localhost:3000"},
        methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE, RequestMethod.PATCH ,RequestMethod.OPTIONS},
        allowedHeaders = "*"
)

public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("user/list")
    public ResponseEntity<List<User>> getList() {
        List<User> userList = repository.findAll();
        return ResponseEntity.ok(userList);
    }
}
