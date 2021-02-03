package com.cleancode.homework.restfulapi.dto.request;

import com.cleancode.homework.restfulapi.common.RegisterMode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RegisterUserReqDto {

    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

    @ApiModelProperty(value = "User email", example = "xyz@gmail.com")
    private String email;

    @ApiModelProperty(value = "User password", example = "123456")
    private String password;

    @ApiModelProperty(value = "User mode", example = "STUDENT")
    private RegisterMode mode;

    TeacherInfo teacher;
    StudentInfo student;
}
