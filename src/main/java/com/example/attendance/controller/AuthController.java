package com.example.attendance.controller;

import com.example.attendance.dto.LoginRequest;
import com.example.attendance.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

//    @PostMapping("/login")
//    public String login(@RequestBody LoginRequest request) {
//        return authService.login(request.getEmail(), request.getPassword());
//    }
}