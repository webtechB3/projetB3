package com.projetb3.api.controllers;

import com.projetb3.api.entities.Publications;
import com.projetb3.api.repositories.IPublicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/publications")
public class PublicationsController {


    @Autowired
    private IPublicationsRepository publicationsRepository;

    @GetMapping()
    public @ResponseBody
    List<Publications> getAllPublications(){
        return publicationsRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Optional<Publications> getPublication(@PathVariable Integer id){
        return publicationsRepository.findById(id);
    }

    @PostMapping()
    public @ResponseBody Publications addNewPublication(@RequestBody Publications newEleve){
        return publicationsRepository.save(newEleve);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody List<Publications> deletePublication(@PathVariable Integer id){
        publicationsRepository.deleteById(id);
        return publicationsRepository.findAll();
    }

    @PatchMapping()
    public @ResponseBody Publications updatePublication(@RequestBody Publications newPublication){
        return publicationsRepository.save(newPublication);
    }

}
