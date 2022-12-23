package com.example.spring_web_api;

import com.example.spring_web_api.algo.MaxMinAlgo;
import com.example.spring_web_api.request.MaxMin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NumberController {

    @PostMapping("/max")
    public Integer Number(@RequestBody MaxMin maxMin) {
        MaxMinAlgo x = new MaxMinAlgo();
        int max = x.findMax(maxMin) ;
        return max;
    }
}




