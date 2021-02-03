package com.cleancode.homework.restfulapi.factory;

import com.cleancode.homework.restfulapi.dto.request.RegisterUserReqDto;
import com.cleancode.homework.restfulapi.entity.Student;
import com.cleancode.homework.restfulapi.entity.Teacher;
import com.cleancode.homework.restfulapi.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    @Autowired
    private ModelMapper modelMapper;

    public User createUser(RegisterUserReqDto registerDto) {
        switch (registerDto.getMode()) {
            case STUDENT:
                return createStudent(registerDto);
            case TEACHER:
                return createTeacher(registerDto);
            default:
                throw new UnsupportedOperationException("Unsupported register mode");
        }
    }

    private Student createStudent(RegisterUserReqDto registerDto) {
        Student student = modelMapper.map(registerDto, Student.class);
        modelMapper.map(registerDto.getStudent(), student);
        return student;
    }

    private Teacher createTeacher(RegisterUserReqDto registerDto) {
        Teacher teacher = modelMapper.map(registerDto, Teacher.class);
        modelMapper.map(registerDto.getTeacher(), teacher);
        return teacher;
    }

}
