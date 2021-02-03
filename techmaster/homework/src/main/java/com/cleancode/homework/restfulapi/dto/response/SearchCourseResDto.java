package com.cleancode.homework.restfulapi.dto.response;

import lombok.Data;

@Data
public class SearchCourseResDto {

    private Integer id;
    private String name;
    private String location;
    private String teacherName;

}
