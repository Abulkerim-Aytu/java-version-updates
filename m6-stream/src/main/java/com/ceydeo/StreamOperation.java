package com.ceydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class StreamOperation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        list.forEach(System.out::println);


        System.out.println("Filter");
        list.stream ()
                .filter (i -> i%2==0)
                .forEach(System.out::println);


        System.out.println("Distinct");
        Stream<Integer> str =list.stream ()
                .filter (i -> i%2==0)
                .distinct();

        str.forEach (System.out::println);

        System.out.println("Limit");
            list.stream ()
                .filter (i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);











    }
}
