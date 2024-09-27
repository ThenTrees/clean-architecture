package com.thentrees.cleanarchitecture.adapters.gateway;

import com.thentrees.cleanarchitecture.core.entity.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    void deleteById(Long id);
}