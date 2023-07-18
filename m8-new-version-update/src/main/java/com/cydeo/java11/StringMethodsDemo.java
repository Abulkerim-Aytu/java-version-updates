package com.cydeo.java11;

public class StringMethodsDemo {
    public static void main(String[] args) {
        var str = "Mike In Ozzy In Tom In Emmy";
        str.lines().forEach(System.out::println);
    }
}
