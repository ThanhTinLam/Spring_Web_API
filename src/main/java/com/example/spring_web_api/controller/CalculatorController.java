package com.example.spring_web_api.controller;

import com.example.spring_web_api.algo.CalculatorAlgo;
import com.example.spring_web_api.request.CalculatorInPut;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CalculatorController {

    @PostMapping("/sum")
    public Double Sumnumber(@RequestBody CalculatorInPut sumCalculator){
        CalculatorAlgo x = new CalculatorAlgo();
        double sumcal = x.sumCalculator(sumCalculator);
        return sumcal;
    }

    @PostMapping("/subtract")
    public Double Subtract(@RequestBody CalculatorInPut subtractCalculator){
        CalculatorAlgo x = new CalculatorAlgo();
        double subcal = x.subtractCalculator(subtractCalculator);
        return subcal;
    }

    @PostMapping("/multiple")
    public Double Multiple(@RequestBody CalculatorInPut mutipleCalculator){
        CalculatorAlgo x = new CalculatorAlgo();
        double mulcal = x.mutipleCalculator(mutipleCalculator);
        return mulcal;
    }

    @PostMapping ("/divide")
    public Double Divide(@RequestBody CalculatorInPut divideCalculator){
        CalculatorAlgo x = new CalculatorAlgo();
        double divcal = x.divideCalculator(divideCalculator);
        return divcal;
    }
}
