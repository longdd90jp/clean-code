package com.cleancode.homework.restfulapi.strategies;

import com.cleancode.homework.restfulapi.entity.Course;

import java.util.Comparator;
import java.util.List;

public class SortCourseByOpenedDateStrategy implements SortingCourseStrategy {

    @Override
    public void sort(List<Course> courses) {
        courses.sort(Comparator.comparing(Course::getOpenedDate));
    }

}
