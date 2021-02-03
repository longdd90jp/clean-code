package com.cleancode.homework.restfulapi.repository;

import com.cleancode.homework.restfulapi.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findByNameContainingIgnoreCase(String keyword);
}
