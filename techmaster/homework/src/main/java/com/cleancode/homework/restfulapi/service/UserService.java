package com.cleancode.homework.restfulapi.service;

import com.cleancode.homework.restfulapi.dto.request.RegisterUserReqDto;
import com.cleancode.homework.restfulapi.dto.response.RegisterUserResDto;
import com.cleancode.homework.restfulapi.entity.User;
import com.cleancode.homework.restfulapi.error.ErrorCodes;
import com.cleancode.homework.restfulapi.error.ServiceRuntimeException;
import com.cleancode.homework.restfulapi.factory.UserFactory;
import com.cleancode.homework.restfulapi.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserFactory userFactory;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public RegisterUserResDto createUser(RegisterUserReqDto userReqDto) {
        if(userRepository.existsByEmail(userReqDto.getEmail())) {
            throw new ServiceRuntimeException(
                    HttpStatus.BAD_REQUEST,
                    ErrorCodes.USER_ERR_001,
                    String.format("register email has exist : %s", userReqDto.getEmail()));
        }
        User user = userFactory.createUser(userReqDto);
        userRepository.save(user);
        return modelMapper.map(user, RegisterUserResDto.class);
    }
}
