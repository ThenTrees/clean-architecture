package com.thentrees.cleanarchitecture.core.usecase;

import com.thentrees.cleanarchitecture.adapters.gateway.UserRepository;
import com.thentrees.cleanarchitecture.core.entity.User;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}