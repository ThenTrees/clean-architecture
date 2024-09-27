package com.thentrees.cleanarchitecture.core.usecase;


import com.thentrees.cleanarchitecture.adapters.gateway.UserRepository;
import com.thentrees.cleanarchitecture.core.entity.User;

import java.util.Optional;

public class DeleteUserUseCase {
    private final UserRepository userRepository;

    public DeleteUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}