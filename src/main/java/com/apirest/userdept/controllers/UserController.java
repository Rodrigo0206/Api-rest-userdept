package com.apirest.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apirest.userdept.entities.User;
import com.apirest.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
    /*@DeleteMapping(value = "/{id}")
    public User delete(@PathVariable Long id ) {
        User result = repository.deleteById(id) ;
        return result;
    }

    @DeleteMapping("/{id}")
    public User  delete(@PathVariable Long id) {
        repository.deleteById(id);
    }*/


}
