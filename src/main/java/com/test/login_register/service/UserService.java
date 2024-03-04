package com.test.login_register.service;

import java.util.List;

import com.test.login_register.dto.UserDto;
import com.test.login_register.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}