package com.example.Greeter;

import com.example.greeterstarter.GreeterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreeterApplication {
    private GreeterService greeterService;

    public GreeterApplication(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    public static void main(String[] args) {
        SpringApplication.run(GreeterApplication.class, args);
    }

    @GetMapping("/who")
    @ConditionalOnBean({GreeterService.class})
    public String who() {
        return greeterService.who();
    }
}

