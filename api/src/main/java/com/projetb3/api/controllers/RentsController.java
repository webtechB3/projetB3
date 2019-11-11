package com.projetb3.api.controllers;

import com.projetb3.api.entities.Rents;
import com.projetb3.api.repositories.IRentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/rents")
public class RentsController {


    @Autowired
    private IRentsRepository rentsRepository;

    @GetMapping()
    public @ResponseBody
    List<Rents> getAllRents(){
        return rentsRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Optional<Rents> getRent(@PathVariable Integer id){
        return rentsRepository.findById(id);
    }

    @PostMapping()
    public @ResponseBody Rents addNewRent(@RequestBody Rents newRent){
        return rentsRepository.save(newRent);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody List<Rents> deleteRent(@PathVariable Integer id){
        rentsRepository.deleteById(id);
        return rentsRepository.findAll();
    }

    @PatchMapping()
    public @ResponseBody Rents updateRent(@RequestBody Rents newRent){
        return rentsRepository.save(newRent);
    }

}
