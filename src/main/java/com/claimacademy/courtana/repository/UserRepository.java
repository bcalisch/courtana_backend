package com.claimacademy.courtana.repository;

import com.claimacademy.courtana.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
