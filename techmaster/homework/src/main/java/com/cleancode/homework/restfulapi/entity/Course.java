package com.cleancode.homework.restfulapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    private String name;

    private String description;

    private String location;

    private Date openedDate;

    private Date closedDate;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private Set<Enroll> enrolls = new HashSet<>();
}
