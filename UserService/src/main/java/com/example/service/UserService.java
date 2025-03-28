package com.example.service;

import com.example.entity.User;
import com.example.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(User user){
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return userRepo.save(user);
    }

    public User getUser(int id){
        return userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
