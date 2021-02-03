package com.cleancode.homework.restfulapi.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RegisterUserResDto {

    @ApiModelProperty(value = "Registered User name", example = "nguyen van a")
    private String name;

    @ApiModelProperty(value = "Registered User email", example = "sample@test.com")
    private String email;

}
