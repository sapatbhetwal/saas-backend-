package io.github.sapatbhetwal.saas_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

     @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http //-< this is the object 
        .csrf(csrf->csrf.disable()) //lambda expressions calling a method on that object  
        .authorizeHttpRequests(auth->auth
            .requestMatchers(HttpMethod.POST,"/api/auth/register").permitAll()
            .anyRequest().authenticated()
        );
        return http.build();// here http is object we initialized above 
    }

}