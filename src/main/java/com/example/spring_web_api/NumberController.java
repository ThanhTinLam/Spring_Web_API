package com.example.spring_web_api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NumberController {

    @PostMapping("/max")
    public Integer Number(@RequestBody MaxMin maxMin) {
        if (maxMin.number1 < maxMin.number2) {
            return maxMin.number2;
        }
        return maxMin.number1;
    }
}




