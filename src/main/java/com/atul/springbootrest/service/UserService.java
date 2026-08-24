package com.atul.springbootrest.service;

import com.atul.springbootrest.model.User;
import com.atul.springbootrest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User register(User user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);
    }
}
