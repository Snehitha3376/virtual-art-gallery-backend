package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.CartItem;
import com.gallery.service.CartService;   // ✅ IMPORTANT

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins="http://localhost:3000")
public class CartController {

    @Autowired
    private CartService service;  

    @PostMapping
    public CartItem add(@RequestBody CartItem item){
        return service.addItem(item);
    }

    @GetMapping("/{userId}")
    public List<CartItem> get(@PathVariable Long userId){
        return service.getByUser(userId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}