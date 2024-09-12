package com.nagarro.DockerAssignment1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.DockerAssignment1.entity.UserInput;
import com.nagarro.DockerAssignment1.repo.UserInputRepository;

@Service
public class UserInputService {
	
	@Autowired
    private UserInputRepository repository;

    public UserInput saveInput(String input) {
        UserInput userInput = new UserInput(input);
        return repository.save(userInput);
    }
}
