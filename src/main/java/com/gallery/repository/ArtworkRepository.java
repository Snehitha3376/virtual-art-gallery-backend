package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gallery.model.Artwork;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {

}