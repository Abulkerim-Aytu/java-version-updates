package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(250, Color.RED));
        inventory.add(new Apple(190, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        Comparator<Apple> sortApple= comparing((Apple apple)->apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        // simplify version
        //Comparator<Apple> sortApple2=comparing(Apple::getWeight);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Reverse version
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getWeight));
    }
}
