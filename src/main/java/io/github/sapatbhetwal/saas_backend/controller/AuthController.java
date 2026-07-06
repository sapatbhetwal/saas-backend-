package io.github.sapatbhetwal.saas_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.sapatbhetwal.saas_backend.dto.RegisterRequest;
@RestController 
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/register")
    public  String register(@RequestBody RegisterRequest request  ){
        return "welcome"+request.getName();
    }
}


