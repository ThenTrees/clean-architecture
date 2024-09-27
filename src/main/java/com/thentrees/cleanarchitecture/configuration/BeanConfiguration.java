package com.thentrees.cleanarchitecture.configuration;

import com.thentrees.cleanarchitecture.adapters.gateway.UserRepository;
import com.thentrees.cleanarchitecture.core.usecase.CreateUserUseCase;
import com.thentrees.cleanarchitecture.core.usecase.DeleteUserUseCase;
import com.thentrees.cleanarchitecture.core.usecase.GetUserUseCase;
import com.thentrees.cleanarchitecture.core.usecase.UpdateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUserUseCase createUserUseCase(UserRepository userRepository) {
        return new CreateUserUseCase(userRepository);
    }

    @Bean
    public GetUserUseCase getUserUseCase(UserRepository userRepository) {
        return new GetUserUseCase(userRepository);
    }

    @Bean
    public UpdateUserUseCase updateUserUseCase(UserRepository userRepository) {
        return new UpdateUserUseCase(userRepository);
    }

    @Bean
    public DeleteUserUseCase deleteUserUseCase(UserRepository userRepository) {
        return new DeleteUserUseCase(userRepository);
    }
}