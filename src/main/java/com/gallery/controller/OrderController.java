package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.Order;
import com.gallery.service.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins="http://localhost:3000")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order place(@RequestBody Order order){
        return service.placeOrder(order);   // ✅ IMPORTANT
    }

    @GetMapping
    public List<Order> all(){
        return service.getAll();
    }
}