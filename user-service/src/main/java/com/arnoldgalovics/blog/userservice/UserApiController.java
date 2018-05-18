package com.arnoldgalovics.blog.userservice;

import com.arnoldgalovics.blog.userservice.api.UserApi;
import com.arnoldgalovics.blog.userservice.model.ListUserResponse;
import com.arnoldgalovics.blog.userservice.model.UserCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserApiController implements UserApi {
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
