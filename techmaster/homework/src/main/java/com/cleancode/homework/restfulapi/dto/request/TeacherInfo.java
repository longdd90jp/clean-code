package com.cleancode.homework.restfulapi.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherInfo {

    @ApiModelProperty(value = "Teacher phone number ", example = "0987551836")
    private String phone;

    @ApiModelProperty(value = "Teacher experiences year", example = "15")
    private Integer experiences;

}
