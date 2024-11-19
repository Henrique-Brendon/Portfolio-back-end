package com.henrique.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.backend.dtos.UserDTO;
import com.henrique.backend.entities.User;
import com.henrique.backend.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    
    private final UserService services;

    public UserController(UserService services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        var user = services.saveUser(userDTO);
        return ResponseEntity.ok().body(user);
    }

}
