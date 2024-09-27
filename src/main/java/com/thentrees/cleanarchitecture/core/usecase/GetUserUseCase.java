package com.thentrees.cleanarchitecture.core.usecase;

import com.thentrees.cleanarchitecture.adapters.gateway.UserRepository;
import com.thentrees.cleanarchitecture.core.entity.User;

import java.util.Optional;

public class GetUserUseCase {
    private final UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}