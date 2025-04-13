package com.example.signup.controller;


import com.example.signup.entity.User;
import com.example.signup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public String loginUser(@RequestBody User user) {
        User existingUser = userService.getUserByEmail(user.getEmail());

        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            Long id = existingUser.getId();

            // Call the homepage microservice at port 8082 using the user ID
            String url = "http://localhost:8082/api/transactions/" + id;
            String response;

            try {
                response = restTemplate.getForObject(url, String.class);
            } catch (Exception e) {
                return "Login successful, but failed to connect to homepage microservice: " + e.getMessage();
            }

            return "Login successful. Response from Homepage Service: " + response;
        } else {
            return "Invalid Email or Password!";
        }
    }
}


