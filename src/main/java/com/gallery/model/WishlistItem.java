package com.gallery.model;

import jakarta.persistence.*;

@Entity
public class WishlistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long artworkId;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    public Long getArtworkId() { return artworkId; }

    public void setArtworkId(Long artworkId) { this.artworkId = artworkId; }
}