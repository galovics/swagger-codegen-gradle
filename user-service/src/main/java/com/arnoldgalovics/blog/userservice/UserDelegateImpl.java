package com.arnoldgalovics.blog.userservice;

import com.arnoldgalovics.blog.userservice.api.UserApiDelegate;
import com.arnoldgalovics.blog.userservice.model.ListUserResponse;
import com.arnoldgalovics.blog.userservice.model.UserCreateRequest;
import com.arnoldgalovics.blog.userservice.model.UserResponse;
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
        ListUserResponse response = new ListUserResponse();
        response.add(new UserResponse().id(1).name("Steve"));
        response.add(new UserResponse().id(2).name("Bill"));
        return response;
    }
}
