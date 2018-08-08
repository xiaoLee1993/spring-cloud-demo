package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    TestInterface testInterface;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return testInterface.sayHiFromClientOne( name );
    }
}