package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeableRepository extends JpaRepository<Timetable,Long> {
}
