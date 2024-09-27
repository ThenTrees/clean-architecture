package com.thentrees.cleanarchitecture.adapters.controller;

import com.thentrees.cleanarchitecture.core.entity.User;
import com.thentrees.cleanarchitecture.core.usecase.CreateUserUseCase;
import com.thentrees.cleanarchitecture.core.usecase.DeleteUserUseCase;
import com.thentrees.cleanarchitecture.core.usecase.GetUserUseCase;
import com.thentrees.cleanarchitecture.core.usecase.UpdateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final GetUserUseCase getUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return createUserUseCase.createUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return getUserUseCase.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return updateUserUseCase.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        deleteUserUseCase.deleteUserById(id);
    }
}