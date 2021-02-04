package com.cleancode.homework.restfulapi.controller;

import com.cleancode.homework.restfulapi.dto.response.SearchCourseResDto;
import com.cleancode.homework.restfulapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/api/v1/courses")
    @Cacheable("courses")
    public ResponseEntity<List<SearchCourseResDto>> createUser(
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) String sortBy) {
        List<SearchCourseResDto> response  = courseService.searchCourses(keyword, sortBy);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
