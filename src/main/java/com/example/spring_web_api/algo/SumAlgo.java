package com.example.spring_web_api.algo;

import com.example.spring_web_api.request.SumListArray;
import com.example.spring_web_api.request.ThreeNumber;

import java.util.List;

public class SumAlgo {
    private int sum;

    public Integer sum3Number(ThreeNumber sum3) {
        sum = sum3.number1 + sum3.number02 + sum3.number03;
        return sum;
    }

    public Integer sumListArray(SumListArray sum1) {
        List<Integer> numbers = sum1.numbers;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum;
    }

    public Integer sumEvenNumber(SumListArray sum2) {
        List<Integer> numbers = sum2.numbers;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum = sum + numbers.get(i);
            }
        }
        return sum;
    }

    public Integer sumPrimeNumber(SumListArray sum3) {
        List<Integer> numbers = sum3.numbers;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            boolean flag = false;
            int num = numbers.get(i);
            int j = 2;
            while (j <= num / 2) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
                ++j;
            }
            if (!flag) sum = sum + numbers.get(i);
        }
        return sum;
    }

    public Double averageNumber(SumListArray sum4) {
        List<Integer> numbers = sum4.numbers;
        double total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total = total + numbers.get(i);
        }
        double avg = total / numbers.size();
        return avg;
    }

    public void ascendingNumber(SumListArray sum5) {
        List<Integer> numbers = sum5.numbers;
        int a = numbers.size();
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
    }
}