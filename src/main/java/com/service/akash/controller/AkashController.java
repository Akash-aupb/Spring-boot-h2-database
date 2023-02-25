package com.service.akash.controller;

import com.service.akash.model.UserAk;
import com.service.akash.service.UserService;
import org.apache.catalina.User;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="akash")
public class AkashController {

    Logger logger= LoggerFactory.getLogger(AkashController.class);

    @Autowired
    UserService userService;


    @GetMapping(value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> Hello(){


        logger.info("hello API called");
        return ResponseEntity.status(200).body("Hello World");
    }

    @CrossOrigin
    @PostMapping("/insertUser")
    public void insertUser(@RequestBody UserAk user){


        logger.info("insertUser method called with this user"+user.getName());
        userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<UserAk> getAllUsers(){

        logger.info("hello API called");
       return userService.getUsers();
    }

}
