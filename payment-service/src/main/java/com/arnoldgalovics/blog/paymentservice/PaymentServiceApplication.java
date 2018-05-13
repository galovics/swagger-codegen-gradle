package com.arnoldgalovics.blog.paymentservice;

import com.arnoldgalovics.blog.userservice.api.UserApiClient;
import com.arnoldgalovics.blog.userservice.model.UserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = UserApiClient.class)
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}

@RestController("/payment")
class PaymentController {
    private UserApiClient userApiClient;

    public PaymentController(UserApiClient userApiClient) {
        this.userApiClient = userApiClient;
    }

    @GetMapping
    public ListPayingUserResponse getPayingUsers() {
        return new ListPayingUserResponse(userApiClient.getUsers().stream().map(UserResponse::getName).collect(Collectors.toList()));
    }
}

class ListPayingUserResponse {
    private List<String> names;

    public ListPayingUserResponse(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}