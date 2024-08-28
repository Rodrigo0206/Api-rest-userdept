package com.apirest.userdept.controllers;

import com.apirest.userdept.entities.User;
import com.apirest.userdept.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserController repository;

    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }
}
