package com.example.User_Service.controller;

import com.example.User_Service.model.UserEntity;
import com.example.User_Service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service){

        this.service=service;

    }
    @GetMapping

   // public String getUsers(){
    public List<UserEntity> getUsers(){
      //  return "service is working";
       return service.getAll();


    }
    @PostMapping

    public UserEntity create(@RequestBody UserEntity user) {
        return service.create(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable("id")  Long id) {
        UserEntity user = service.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


}

