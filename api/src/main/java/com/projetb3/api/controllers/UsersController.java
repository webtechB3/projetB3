package com.projetb3.api.controllers;

import com.projetb3.api.entities.Users;
import com.projetb3.api.repositories.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/users")
public class UsersController {


    @Autowired
    private IUsersRepository usersRepository;

    @GetMapping()
    public @ResponseBody
    List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Optional<Users> getUser(@PathVariable Integer id){
        return usersRepository.findById(id);
    }

    @PostMapping()
    public @ResponseBody Users addNewUser(@RequestBody Users newUser){
        return usersRepository.save(newUser);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody List<Users> deleteUser(@PathVariable Integer id){
        usersRepository.deleteById(id);
        return usersRepository.findAll();
    }

    @PatchMapping()
    public @ResponseBody Users updateUser(@RequestBody Users newUser){
        return usersRepository.save(newUser);
    }
}
