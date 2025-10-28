package com.example.demo.controller;


import com.example.demo.entity.Course;
import com.example.demo.entity.Timetable;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.TimeableRepository;
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
@Slf4j
@CrossOrigin(
        origins = {"http://localhost:3000"},
        methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE, RequestMethod.PATCH ,RequestMethod.OPTIONS},
        allowedHeaders = "*"
)

public class TimetableController {
    @Autowired
    private TimeableRepository repository;

    @GetMapping("timeable/list")
    public ResponseEntity<List<Timetable>> getList() {
        List<Timetable> timetableList = repository.findAll();
        return ResponseEntity.ok(timetableList);
    }
}
