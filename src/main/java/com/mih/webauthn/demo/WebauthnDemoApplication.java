package com.mih.webauthn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.mih.webauthn.demo")
public class WebauthnDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebauthnDemoApplication.class, args);
    }
}
