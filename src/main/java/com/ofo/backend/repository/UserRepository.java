package com.ofo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofo.backend.model.App_User;

public interface UserRepository extends JpaRepository<App_User, Long>{
    // public User findByEmail(String username);
}
