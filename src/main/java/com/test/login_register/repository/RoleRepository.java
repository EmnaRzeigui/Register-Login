package com.test.login_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.login_register.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}