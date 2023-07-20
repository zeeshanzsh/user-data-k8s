package com.zeeshan.userdata.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class UserController {


    @GetMapping("/")
    public String index(){
        return "User service is up";
    }
    @GetMapping("/users")
    public List<String> users(){
        log.info("Get all the users");
        List<String> users= new ArrayList<>();
        users.add("Mike");
        users.add("John");
        return users;
    }
}
