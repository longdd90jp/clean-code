package com.cleancode.homework.restfulapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(name = "teacherId")
public class Teacher extends User {

    private String phone;

    private Integer experiences;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
    private Set<Course> courses = new HashSet<>();
}
