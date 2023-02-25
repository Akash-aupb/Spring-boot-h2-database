package com.service.akash.service;


import com.service.akash.model.UserAk;
import com.service.akash.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserAk user){
        userRepository.save(user);
    }

    public List<UserAk> getUsers(){
      return  userRepository.findAll();
    }
}
