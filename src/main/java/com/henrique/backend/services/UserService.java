package com.henrique.backend.services;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.henrique.backend.dtos.UserDTO;
import com.henrique.backend.entities.User;
import com.henrique.backend.repositories.UserRepository;

@Service
public class UserService {
    
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(UserDTO userDTO) {
        var user = new User(null, userDTO.name(), userDTO.email(), userDTO.phone(),
            userDTO.message(), Instant.now()); 
        return repository.save(user);
    }
    
}
