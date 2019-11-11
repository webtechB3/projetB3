package com.projetb3.api.controllers;

import com.projetb3.api.entities.Reservations;
import com.projetb3.api.repositories.IReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/reservations")
public class ReservationsController {


    @Autowired
    private IReservationsRepository reservationsRepository;

    @GetMapping()
    public @ResponseBody
    List<Reservations> getAllReservations(){
        return reservationsRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Optional<Reservations> getReservation(@PathVariable Integer id){
        return reservationsRepository.findById(id);
    }

    @PostMapping()
    public @ResponseBody Reservations addNewReservation(@RequestBody Reservations newReservation){
        return reservationsRepository.save(newReservation);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody List<Reservations> deleteReservation(@PathVariable Integer id){
        reservationsRepository.deleteById(id);
        return reservationsRepository.findAll();
    }

    @PatchMapping()
    public @ResponseBody Reservations updateReservation(@RequestBody Reservations newReservation){
        return reservationsRepository.save(newReservation);
    }
}
