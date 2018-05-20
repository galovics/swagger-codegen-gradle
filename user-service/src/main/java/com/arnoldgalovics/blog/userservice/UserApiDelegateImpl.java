package com.arnoldgalovics.blog.userservice;

import com.arnoldgalovics.blog.userservice.api.UserApiDelegate;
import com.arnoldgalovics.blog.userservice.model.ListUserResponse;
import com.arnoldgalovics.blog.userservice.model.UserCreateRequest;
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
    public ResponseEntity<ListUserResponse> getUsers() {
        // TODO: implementation
        return null;
    }
}
