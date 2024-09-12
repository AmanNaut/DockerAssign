package com.nagarro.DockerAssignment1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.DockerAssignment1.entity.UserInput;
import com.nagarro.DockerAssignment1.service.UserInputService;

@CrossOrigin(origins = "http://localhost:3000") // allow frontend from this origin
@RestController
@RequestMapping("/api/input")
public class UserInputController {
	@Autowired
    private UserInputService service;

    @PostMapping
    public UserInput saveInput(@RequestBody String inputValue) {
        return service.saveInput(inputValue);
    }
}
