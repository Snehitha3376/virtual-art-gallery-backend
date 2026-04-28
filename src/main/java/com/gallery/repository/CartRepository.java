package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.gallery.model.CartItem;

public interface CartRepository extends JpaRepository<CartItem, Long> {

    List<CartItem> findByUserId(Long userId);

}