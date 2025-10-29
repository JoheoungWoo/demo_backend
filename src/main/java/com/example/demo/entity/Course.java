package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tbl_course")
@ToString
@Getter
// 충돌 2
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id") // ✅ id 컬럼명 명시 (참조 시 명확하게)
    private Long id;

    private String courseName;
    private float credits;

    // ✅ referencedColumnName은 생략해도 자동으로 PK를 참조함
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private User professor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Timetable> timetables;
}
