package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", 23,Gender.MALE);
        Person p2 = new Person("Aytu", 25,Gender.MALE);
        Person p3 = new Person("Sikck", 23,Gender.FEMALE);
        Person p4 = new Person("Lale", 23,Gender.FEMALE );

        List<Person> PersonList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;
        printTest(PersonList,checkMember);

    }

    private static void printTest (List<Person> personList,CheckMember Member){
        List<Person> result= new ArrayList<>();
    for (Person person: personList){
        if (Member.test(person)){
            result.add(person);
        }
    }
    }
}
