package com.cleancode.homework.restfulapi.service;

import com.cleancode.homework.restfulapi.common.SortCourseType;
import com.cleancode.homework.restfulapi.dto.response.SearchCourseResDto;
import com.cleancode.homework.restfulapi.entity.Course;
import com.cleancode.homework.restfulapi.repository.CourseRepository;
import com.cleancode.homework.restfulapi.strategies.SortCourseByNameStrategy;
import com.cleancode.homework.restfulapi.strategies.SortCourseByOpenedDateStrategy;
import com.cleancode.homework.restfulapi.strategies.SortingCourseStrategy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseService {

    private static Map<String, SortingCourseStrategy> strategies;

    static {
        strategies = new HashMap<>();
        strategies.put(SortCourseType.SORT_BY_NAME, new SortCourseByNameStrategy());
        strategies.put(SortCourseType.SORT_OPENED_DATE, new SortCourseByOpenedDateStrategy());
    }

    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    public List<SearchCourseResDto> searchCourses(String keyword, String sortBy) {
        List<Course> courses = queryCourses(keyword);
        SortingCourseStrategy sortingStrategy = lookupSortingStrategy(sortBy);
        sortingStrategy.sort(courses);

        List<SearchCourseResDto> searchResults = new ArrayList<>();
        courses.forEach(course -> {
            SearchCourseResDto courseResDto = new SearchCourseResDto();
            courseResDto.setId(course.getCourseId());
            courseResDto.setLocation(course.getLocation());
            courseResDto.setName(course.getName());
            courseResDto.setTeacherName(course.getTeacher().getName());
            searchResults.add(courseResDto);
        });

        return searchResults;
    }

    private List<Course> queryCourses(String keyword) {
        List<Course> courses;
        if(StringUtils.isEmpty(keyword)) {
            courses = courseRepository.findAll();
        } else {
            courses = courseRepository.findByNameContainingIgnoreCase(keyword);
        }
        return courses;
    }

    private SortingCourseStrategy lookupSortingStrategy(String sortBy) {
        if(StringUtils.isEmpty(sortBy)) {
            sortBy = SortCourseType.SORT_BY_NAME;
        }
        SortingCourseStrategy sortingStrategy = strategies.get(sortBy);
        if (sortingStrategy == null) {
            throw new UnsupportedOperationException("Unsupported sorting type");
        }
        return sortingStrategy;
    }
}
