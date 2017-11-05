package com.example.Greeter;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    public String who() {
        return String.format("Hello~ it's me! From Greeter");
    }
}
