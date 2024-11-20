package com.henrique.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.henrique.backend.dtos.UserDTO;
import com.henrique.backend.repositories.UserRepository;
import com.henrique.backend.services.UserService;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @Override
    public void run(String... args) throws Exception {
        var user = new UserDTO("teste", "teste", "teste", "teste");
        service.saveUser(user);
    }
}
