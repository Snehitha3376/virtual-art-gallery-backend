package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gallery.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}