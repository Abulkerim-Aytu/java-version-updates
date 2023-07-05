package com.cydeo.task;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(250, Color.RED));
        inventory.add(new Orange(190, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        OrangeForMatter orangeWeight = (orange) -> "An orange of "+ orange.getWeight() + "g";
        prettyPrintOrange(inventory,orangeWeight);

        System.out.println("************************");

        OrangeForMatter OrangeColor= orange -> {
            String ch = orange.getWeight() >200 ? "Heavy":"Light";
            return "A " + ch + " "+ orange.getColor() + " orange"; // here we use return because of multi line usege.
        };
        prettyPrintOrange(inventory,OrangeColor);

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeForMatter forMatter){
    for (Orange orange: inventory){
        String output = forMatter.result(orange);
        System.out.println(output);
    }
    }
}
