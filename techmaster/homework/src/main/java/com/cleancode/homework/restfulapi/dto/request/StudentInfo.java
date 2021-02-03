package com.cleancode.homework.restfulapi.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentInfo {

    @ApiModelProperty(value = "Student year", example = "2020")
    private Integer year;

}
