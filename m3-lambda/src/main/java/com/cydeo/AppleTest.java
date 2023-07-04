package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(250, Color.RED));
        inventory.add(new Apple(190, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        AppleHeavyPredicate abs = new AppleHeavyPredicate();
        List<Apple> heavyApple= filterApple(inventory,abs);
        System.out.println(heavyApple);

        List<Apple> greenApple= filterApple(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);
    }

    private static List<Apple> filterApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
