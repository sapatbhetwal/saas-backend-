package io.github.sapatbhetwal.saas_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.sapatbhetwal.saas_backend.dto.RegisterRequest;
import io.github.sapatbhetwal.saas_backend.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService; //it needs AuthService object

    public AuthController(AuthService authService) { //constructor 
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        return authService.register(request);

    }
}