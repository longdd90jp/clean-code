package com.cleancode.homework.restfulapi.controller;

import com.cleancode.homework.restfulapi.dto.request.RegisterUserReqDto;
import com.cleancode.homework.restfulapi.dto.response.RegisterUserResDto;
import com.cleancode.homework.restfulapi.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/v1/users")
    @ApiOperation("Create user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create user successfully"),
            @ApiResponse(code = 404, message = "User has exist")
    })
    public ResponseEntity<RegisterUserResDto> createUser(@RequestBody RegisterUserReqDto registerDto) {
        RegisterUserResDto response  = userService.createUser(registerDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
