package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController


public class hello_world{
    @RequestMapping("/")public String hello(){
        return "hello world";
    }
}