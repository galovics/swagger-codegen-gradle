package com.arnoldgalovics.blog.payment;

import com.arnoldgalovics.blog.userservice.api.UserApiClientWrapper;
import com.arnoldgalovics.blog.userservice.model.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController("/payment")
class PaymentController {
    private UserApiClientWrapper userApiClientWrapper;

    public PaymentController(UserApiClientWrapper userApiClientWrapper) {
        this.userApiClientWrapper = userApiClientWrapper;
    }

    @GetMapping
    public ListPayingUserResponse getPayingUsers() {
        return new ListPayingUserResponse(userApiClientWrapper.getUsers().stream().map(UserResponse::getName).collect(Collectors.toList()));
    }
}

