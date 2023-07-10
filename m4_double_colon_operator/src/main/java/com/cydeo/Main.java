package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pred = (p) -> p%2==0 ? true:false;

        Calculate sum = (x,y) -> System.out.println(x+y);
        Calculate s1 = (x,y) -> Calculator.findSome(x,y);
        // If your lambda expression,it's calling a methods you can short this one with double operator.


        // Reference to Static Methods
        Calculate s2=Calculator::findSome;
        s2.calCulate(10,20);

        // Reference to instance methods
        Calculator obj = new Calculator();
        Calculate s3 = obj ::findMultiply;
        Calculate s4 = new Calculator() ::findMultiply;

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer,Double> b = new MyClass()::methods;
        BiFunction<MyClass,Integer,Double> b1=MyClass::methods;






    }
}
