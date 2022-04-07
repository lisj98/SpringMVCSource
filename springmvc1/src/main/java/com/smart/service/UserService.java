package com.smart.service;

import com.smart.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(User user){
        System.out.println("createUser Success");
    }
}
