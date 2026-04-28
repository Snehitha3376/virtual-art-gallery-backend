package com.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.model.CartItem;
import com.gallery.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository repo;

    public CartItem addItem(CartItem item){
        return repo.save(item);
    }

    public List<CartItem> getByUser(Long userId){
        return repo.findByUserId(userId);
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}