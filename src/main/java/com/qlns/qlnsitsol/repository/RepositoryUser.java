package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryUser extends JpaRepository<User,Long> {

    Optional<User> findByUserName(String s);
    Optional<User> findByEmail(String s);
    boolean existsByUserName(String s);
    boolean existsByEmail(String email);
}
