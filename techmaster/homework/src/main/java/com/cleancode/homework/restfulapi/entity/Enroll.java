package com.cleancode.homework.restfulapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enrolls")
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer enrollId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}
