package com.microservice.controller;

import com.microservice.entity.User;
import com.microservice.service.UserService;
import com.microservice.vo.ResponseTemplateVo;
import io.micronaut.http.client.HttpClient;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
@Singleton
public class UserController {


    @Inject
    private UserService userService;

    public UserController() {
    }


    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable ("userId") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }





}
