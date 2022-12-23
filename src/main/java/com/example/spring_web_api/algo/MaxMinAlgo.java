package com.example.spring_web_api.algo;


import com.example.spring_web_api.request.MaxMin;

public class MaxMinAlgo {
    public Integer findMax(MaxMin maxMin) {
        if (maxMin.number1 < maxMin.number2) {
            return maxMin.number2;
        }
        return maxMin.number1;
    }
}
