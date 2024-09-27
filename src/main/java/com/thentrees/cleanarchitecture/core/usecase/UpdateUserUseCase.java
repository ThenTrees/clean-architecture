package com.thentrees.cleanarchitecture.core.usecase;

import com.thentrees.cleanarchitecture.adapters.gateway.UserRepository;
import com.thentrees.cleanarchitecture.core.entity.User;

public class UpdateUserUseCase {
    private final UserRepository userRepository;

    public UpdateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}