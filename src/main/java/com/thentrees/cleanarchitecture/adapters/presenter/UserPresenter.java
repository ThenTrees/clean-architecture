package com.thentrees.cleanarchitecture.adapters.presenter;

import com.thentrees.cleanarchitecture.core.entity.User;
import com.thentrees.cleanarchitecture.dto.UserDto;

public class UserPresenter {
    public UserDto present(User user) {
        // Chuyển đổi User entity thành UserDTO để trình bày
        return new UserDto(user.getName(), user.getEmail());
    }
}
