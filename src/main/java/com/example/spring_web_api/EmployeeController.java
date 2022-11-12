package com.example.spring_web_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class EmployeeController {
    private Employee e = new Employee();

    @GetMapping("/employees")
    public String welcomeAsHTML() {
        return e.userName;
    }
    @PostMapping("/employees")
    public String  newEmployee() {
        e = new Employee();
        e.userName = "xyz";
        return e.userName;

    }
}