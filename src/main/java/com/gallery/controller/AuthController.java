package com.gallery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.User;
import com.gallery.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins="http://localhost:3000")
public class AuthController {

    @Autowired
    UserRepository repo;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        user.setRole("USER");

        return repo.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {

        User existing = repo.findByEmail(user.getEmail());

        if(existing != null &&
           existing.getPassword().equals(user.getPassword())){

            return existing;
        }

        throw new RuntimeException("Invalid credentials");
    }
}