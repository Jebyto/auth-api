package com.example.auth.domain.user;

/**
 * RegisterDTO
 */
public record RegisterDTO(String login, String password, UserRole role) {

}
