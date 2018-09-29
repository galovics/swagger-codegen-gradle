package com.arnoldgalovics.blog.payment;

import com.arnoldgalovics.blog.userservice.api.UserApiClient;
import com.arnoldgalovics.blog.userservice.api.UserApiClientWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackageClasses = {
        PaymentServiceApplication.class,
        UserApiClientWrapper.class
})
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = UserApiClient.class)
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}
