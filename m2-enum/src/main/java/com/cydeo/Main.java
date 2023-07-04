package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c = Currency.PENNY;
        System.out.println(c);
        System.out.println(Currency.DIME);

        System.out.println("How to get all constant");
        Currency[] currencies= Currency.values(); // here we did not use any New word here because of enum.
        for (Currency each :currencies){
            System.out.println(each);
        }

        System.out.println("How to use Switch-case with enums");
        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 4 cent");
                break;
            case DIME:
                System.out.println("It is 5 cent");
                break;
            case QUARTER:
                System.out.println("It is 6 cent");
                break;
        }

        System.out.println("Operation Tesk");
        calculate(5,7,Operation.PLUS);

        System.out.println("How top retrieve the constent value");
        System.out.println(Operation.PLUS.getValue());
        System.out.println(Operation.PLUS.getValue());
        System.out.println(Operation.MINUS.ordinal()); // ordinal: return the index

    }

    private static void calculate(double x, double y, Operation operation){
         switch (operation){
             case PLUS:
                 System.out.println(x+y);
                 break;
             case MINUS:
                 System.out.println(x-y);
                 break;
             case MULTIPLE:
                 System.out.println(x*y);
                 break;
             case DIVIDE:
                 System.out.println(x/y);
                 break;
         }
    }


}
