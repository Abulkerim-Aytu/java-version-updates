package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {




        //=================PREDICATE=================//
        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));


        //=================CONSUMER=================//
        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(10);

        //=================BICONSUMER=================//
        BiConsumer<Integer,Integer> addTwo=(x,y) -> System.out.println(x+y);
        addTwo.accept(2,4);

        //=================FUNCTION=================//
        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        //=================BIFUNCTION=================//
        BiFunction<Integer,Integer,Integer> func= (x1,x2) ->x1+x2;
        System.out.println(func.apply(2,5));

        //=================SUPPLIER=================//
        Supplier<Double> randomValeu=() -> Math.random();
        System.out.println(randomValeu.get());






    }
}
