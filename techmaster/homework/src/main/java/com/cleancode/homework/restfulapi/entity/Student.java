package com.cleancode.homework.restfulapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "students")
@PrimaryKeyJoinColumn(name = "studentId")
public class Student extends User {

    private Integer year;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private Set<Enroll> enrolls = new HashSet<>();
}
