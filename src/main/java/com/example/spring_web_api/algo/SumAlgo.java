package com.example.spring_web_api.algo;

import com.example.spring_web_api.request.SumListArray;
import com.example.spring_web_api.request.ThreeNumber;

import java.util.List;

public class SumAlgo {
    private int sum;

    public Integer sum3Number(ThreeNumber sum3) {
        sum = sum3.number1+ sum3.number02 + sum3.number03;
        return sum;
    }
    public Integer sumListArray(SumListArray sum1){
        List<Integer> numbers = sum1.numbers;
        int sum =0 ;
        for (int i=0 ; i<numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        return sum;
    }
}
