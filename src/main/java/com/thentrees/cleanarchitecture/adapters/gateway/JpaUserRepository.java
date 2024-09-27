package com.thentrees.cleanarchitecture.adapters.gateway;

import com.thentrees.cleanarchitecture.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends UserRepository, JpaRepository<User, Long> {
}