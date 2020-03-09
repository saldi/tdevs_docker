package edu.kubernetes.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/message")
    public String getMessage() {
        return "MESSAGE";
    }


}
