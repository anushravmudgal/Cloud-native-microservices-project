package com.example.User_Service.service;

import com.example.User_Service.model.UserEntity;
import com.example.User_Service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
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

}
