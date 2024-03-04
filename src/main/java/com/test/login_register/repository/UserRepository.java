package com.test.login_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.login_register.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}