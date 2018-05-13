package com.arnoldgalovics.blog.userservice;

import com.arnoldgalovics.blog.userservice.api.UserApiDelegate;
import com.arnoldgalovics.blog.userservice.model.ListUserResponse;
import com.arnoldgalovics.blog.userservice.model.UserCreateRequest;
import org.springframework.stereotype.Component;

@Component
public class UserDelegateImpl implements UserApiDelegate {
    @Override
    public Void createUser(UserCreateRequest user) {
        // TODO: implementation
        return null;
    }

    @Override
    public ListUserResponse getUsers() {
        // TODO: implementation
        return null;
    }
}
