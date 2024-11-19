package com.henrique.backend.dtos;

public record UserDTO(
    String name,
    String email,
    String phone,
    String message) {
    
}
