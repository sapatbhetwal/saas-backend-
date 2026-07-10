package io.github.sapatbhetwal.saas_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

     @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .csrf(csrf->csrf.disable()) //lambda expressions 
        .authorizeHttpRequests(auth->auth
            .requestMatchers(HttpMethod.POST,"/api/auth/register").permitAll()
            .anyRequest().authenticated()
        );
        return http.build();
    }

}