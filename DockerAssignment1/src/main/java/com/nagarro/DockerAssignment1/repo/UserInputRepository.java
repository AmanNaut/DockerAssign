package com.nagarro.DockerAssignment1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.DockerAssignment1.entity.UserInput;

public interface UserInputRepository extends JpaRepository<UserInput, Long> {

}
