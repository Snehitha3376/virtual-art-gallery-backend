package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.gallery.model.WishlistItem;

public interface WishlistRepository extends JpaRepository<WishlistItem, Long> {

    List<WishlistItem> findByUserId(Long userId);

}