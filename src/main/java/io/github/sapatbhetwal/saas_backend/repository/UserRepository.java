package io.github.sapatbhetwal.saas_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.sapatbhetwal.saas_backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}