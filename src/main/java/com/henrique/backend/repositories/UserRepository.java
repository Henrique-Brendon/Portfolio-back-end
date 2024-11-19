package com.henrique.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
