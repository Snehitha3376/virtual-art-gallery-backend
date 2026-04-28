package com.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.model.Artwork;
import com.gallery.repository.ArtworkRepository;

@Service
public class ArtworkService {

    @Autowired
    private ArtworkRepository repo;

    public Artwork addArtwork(Artwork art){
        return repo.save(art);
    }

    public List<Artwork> getAll(){
        return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}