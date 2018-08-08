package com.example.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class TestInterfaceHystric implements TestInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
