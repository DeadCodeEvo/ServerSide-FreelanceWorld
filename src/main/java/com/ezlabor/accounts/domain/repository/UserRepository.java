package com.ezlabor.accounts.domain.repository;

import com.ezlabor.accounts.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
    User findByEmail(String email);
    Optional<User> findById(Long id);
}
