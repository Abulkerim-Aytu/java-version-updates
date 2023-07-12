package com.ceydeo;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

//        int sum = 0;
//        for (int number : numbers) {
//            sum = sum + number;
//        }

        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
