package com.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.model.CartItem;
import com.gallery.model.Order;
import com.gallery.repository.CartRepository;
import com.gallery.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private CartRepository cartRepo;

    // ✅ Place order using cart
    public Order placeOrder(Order order){

        List<CartItem> cartItems = cartRepo.findByUserId(order.getUserId());

        double total = 0;

        for(CartItem item : cartItems){
            total += item.getQuantity() * 100; // simple price logic
        }

        order.setTotalAmount(total);

        Order savedOrder = orderRepo.save(order);

        // clear cart after order
        cartRepo.deleteAll(cartItems);

        return savedOrder;
    }

    public List<Order> getAll(){
        return orderRepo.findAll();
    }
}