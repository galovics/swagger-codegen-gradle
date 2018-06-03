package com.arnoldgalovics.blog.payment;

import com.arnoldgalovics.blog.userservice.api.UserApiClient;
import com.arnoldgalovics.blog.userservice.model.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController("/payment")
class PaymentController {
    private UserApiClient userApiClient;

    public PaymentController(UserApiClient userApiClient) {
        this.userApiClient = userApiClient;
    }

    @GetMapping
    public ListPayingUserResponse getPayingUsers() {
        return new ListPayingUserResponse(userApiClient.getUsers().getBody().stream().map(UserResponse::getName).collect(Collectors.toList()));
    }
}

