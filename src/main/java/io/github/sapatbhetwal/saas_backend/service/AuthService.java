package io.github.sapatbhetwal.saas_backend.service;

import org.springframework.stereotype.Service;

import io.github.sapatbhetwal.saas_backend.dto.RegisterRequest;
import io.github.sapatbhetwal.saas_backend.entity.User;
import io.github.sapatbhetwal.saas_backend.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepository.save(user);

        return "User Registered Successfully";
    }
}