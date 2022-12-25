package com.example.spring_web_api.algo;

import com.example.spring_web_api.request.CalculatorInPut;

public class CalculatorAlgo {


    public Double sumCalculator(CalculatorInPut task1) {
        double sumcal;
        sumcal = task1.num1 + task1.num2;
        return sumcal;
    }

    public Double subtractCalculator(CalculatorInPut task2) {
        double subtract;
        subtract = task2.num1 - task2.num2;
        return subtract;
    }

    public Double mutipleCalculator(CalculatorInPut task3) {
        double multiple;
        multiple = task3.num1 * task3.num2;
        return multiple;
    }

    public Double divideCalculator(CalculatorInPut task4) {
        double divide;
        divide = task4.num1 / task4.num2;
        return divide;
    }
}
