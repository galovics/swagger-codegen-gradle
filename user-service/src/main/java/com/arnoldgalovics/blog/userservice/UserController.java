package com.arnoldgalovics.blog.userservice;

import com.arnoldgalovics.blog.api.UserApi;
import com.arnoldgalovics.blog.model.ListUserResponse;
import com.arnoldgalovics.blog.model.UserCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserController implements UserApi {
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
