package com.example.attendance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordPrinter implements CommandLineRunner {

    private final PasswordEncoder passwordEncoder;

    public PasswordPrinter(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        System.out.println("Encoded password: " + passwordEncoder.encode("1234"));
    }
}