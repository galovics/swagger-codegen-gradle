package com.arnoldgalovics.blog.userservice;

import com.arnoldgalovics.blog.userservice.api.UserApiDelegate;
import com.arnoldgalovics.blog.userservice.model.ListUserResponse;
import com.arnoldgalovics.blog.userservice.model.UserCreateRequest;
import com.arnoldgalovics.blog.userservice.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserApiDelegateImpl implements UserApiDelegate {
    @Override
    public ResponseEntity<Void> createUser(UserCreateRequest user) {
        // TODO: implementation
        return null;
    }

    @Override
    public ListUserResponse getUsers() {
        ListUserResponse response = new ListUserResponse();
        response.add(new UserResponse().name("Arnold").id(1));
        return response;
    }
}
