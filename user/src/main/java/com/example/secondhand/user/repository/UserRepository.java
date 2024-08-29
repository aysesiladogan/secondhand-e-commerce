package com.example.secondhand.user.repository;

import com.example.secondhand.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}