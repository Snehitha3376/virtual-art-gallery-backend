package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.*;
import com.gallery.repository.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins="http://localhost:3000")
public class AdminController {

    @Autowired
    UserRepository userRepo;

    @Autowired
    ArtworkRepository artRepo;

    @Autowired
    OrderRepository orderRepo;

    @GetMapping("/users")
    public List<User> users(){
        return userRepo.findAll();
    }

    @GetMapping("/artworks")
    public List<Artwork> artworks(){
        return artRepo.findAll();
    }

    @GetMapping("/orders")
    public List<Order> orders(){
        return orderRepo.findAll();
    }
}