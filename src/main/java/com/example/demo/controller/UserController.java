package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        System.out.println("LOGIN HIT: " + user.getEmail());

        if (user.getEmail().equals("test@gmail.com")
                && user.getPassword().equals("1234")) {
            return "Login Successful ✅";
        } else {
            return "Invalid Credentials ❌";
        }
    }

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        return "Signup Successful ✅";
    }
}