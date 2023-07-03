package com.cydeo;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Apple");



        printDoubled(items);

        System.out.println("************************");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBalPlayer pat = new BaseBalPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Backham");

        Team<SoccerPlayer> liverPool = new Team("Liverpool");

//        liverPool.addPlayer(joe);
//        liverPool.addPlayer(pat);
        liverPool.addPlayer(beckham);


    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i*2);
        }
    }
}
