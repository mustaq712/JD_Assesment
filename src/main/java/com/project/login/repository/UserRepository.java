package com.project.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
