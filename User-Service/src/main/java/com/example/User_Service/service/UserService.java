package com.example.User_Service.service;

import com.example.User_Service.model.UserEntity;
import com.example.User_Service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;

    }

    public List<UserEntity> getAll(){
        return repo.findAll();
    }

    public UserEntity create(UserEntity user){
        return repo.save(user);
    }

    public UserEntity getUserById(Long id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

    }

}
