package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table(name = "tbl_timetable")
@Data
@Transactional
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timetable_id") // ✅ 명확한 PK명
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id") // ✅ referencedColumnName 생략 가능
    private Course course;

    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
}
