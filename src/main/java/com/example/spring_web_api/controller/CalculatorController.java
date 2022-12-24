package com.example.spring_web_api.controller;

import com.example.spring_web_api.algo.CalculatorAlgo;
import com.example.spring_web_api.request.CalculatorInPut;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @PostMapping("/sum")
    public Integer Sumnumber(@RequestBody CalculatorInPut sumCalculator){
        CalculatorAlgo x = new CalculatorAlgo();
        int sumcal = x.sumCalculator(sumCalculator);
        return sumcal;
    }

//    @PostMapping("/subtract")
//    public Double Subtract(){}
//
//    @PostMapping("/Multiple")
//    public Double Multiple(){}
//
//    @PostMapping ("/divide")
//    public Double Divide(){}
}
