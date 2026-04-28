package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.Artwork;
import com.gallery.service.ArtworkService;

@RestController
@RequestMapping("/api/artworks")
@CrossOrigin(origins="http://localhost:3000")
public class ArtworkController {

    @Autowired
    private ArtworkService service;

    @PostMapping
    public Artwork add(@RequestBody Artwork art){
        return service.addArtwork(art);
    }

    @GetMapping
    public List<Artwork> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}