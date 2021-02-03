package com.cleancode.homework.restfulapi.strategies;

import com.cleancode.homework.restfulapi.entity.Course;

import java.util.List;

public interface SortingCourseStrategy {

    void sort(List<Course> courses);

}
