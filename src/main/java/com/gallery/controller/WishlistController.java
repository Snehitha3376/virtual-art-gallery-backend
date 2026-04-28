package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.WishlistItem;
import com.gallery.repository.WishlistRepository;

@RestController
@RequestMapping("/api/wishlist")
@CrossOrigin(origins="http://localhost:3000")
public class WishlistController {

    @Autowired
    WishlistRepository repo;

    @PostMapping
    public WishlistItem add(@RequestBody WishlistItem item){
        return repo.save(item);
    }

    @GetMapping("/{userId}")
    public List<WishlistItem> get(@PathVariable Long userId){
        return repo.findByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}