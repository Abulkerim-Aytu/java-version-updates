package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
//        Optional actually protected us from the NullPointExceptions.
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);
//empty () - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());
//ifPresent
        Optional<Integer> bigNumber = number.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent (System.out::println);
//        System.out.println(bigNumber);

        //get
        System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse( 5));

    }
}
