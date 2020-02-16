package com.example.demokaka.contrnller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("home")
    public String home() {
        return "hello!";
    }
}
