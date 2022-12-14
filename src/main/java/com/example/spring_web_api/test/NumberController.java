package com.example.spring_web_api.test;

import com.example.spring_web_api.algo.MaxMinAlgo;
import com.example.spring_web_api.algo.SumAlgo;
import com.example.spring_web_api.request.MaxMin;
import com.example.spring_web_api.request.SumListArray;
import com.example.spring_web_api.request.ThreeNumber;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NumberController {

    @PostMapping("/max")
    public Integer Number(@RequestBody MaxMin maxMin) {
        MaxMinAlgo x = new MaxMinAlgo();
        int max = x.findMax(maxMin);
        return max;
    }

    @PostMapping("/sum1")
    public Integer Sum(@RequestBody ThreeNumber sum3) {
        SumAlgo x = new SumAlgo();
        int sum = x.sum3Number(sum3);
        return sum;
    }

    @PostMapping("/sumarray")
    public Integer sumArray(@RequestBody SumListArray sumListArray) {
        SumAlgo x = new SumAlgo();
        int sum = x.sumListArray(sumListArray);
        return sum;
    }

    @PostMapping("/sumevennumber")
    public Integer sumEvenNumber(@RequestBody SumListArray sumEvenNumber) {
        SumAlgo x = new SumAlgo();
        int sum = x.sumEvenNumber(sumEvenNumber);
        return sum;
    }

    @PostMapping("/sumprimenumber")
    public Integer sumPrimeNumber(@RequestBody SumListArray sumPrimeNumber){
        SumAlgo x = new SumAlgo();
        int sum = x.sumPrimeNumber(sumPrimeNumber);
        return sum;
    }
    @PostMapping("/average")
    public Double averageNumber(@RequestBody SumListArray averageNumber){
        SumAlgo x = new SumAlgo();
        double avg = x.averageNumber(averageNumber);
        return avg;
    }
    @PostMapping("/acsendingnumber")
    public SumListArray acsendingNumber(@RequestBody SumListArray ascendingNumber){
        SumAlgo x = new SumAlgo();
        x.ascendingNumber(ascendingNumber);
        return ascendingNumber;
    }
}





