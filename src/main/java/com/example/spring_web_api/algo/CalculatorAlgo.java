package com.example.spring_web_api.algo;

import com.example.spring_web_api.request.CalculatorInPut;

public class CalculatorAlgo {


    public Integer sumCalculator(CalculatorInPut task1){
        int sumcal;
        sumcal = task1.num1 + task1.num2;
        return sumcal;
    }
}
