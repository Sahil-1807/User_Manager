package com.user_management_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserApiController {

    @GetMapping("/test")
    public String testEndPoint(){
        return "Testing end point.";
    }
}
