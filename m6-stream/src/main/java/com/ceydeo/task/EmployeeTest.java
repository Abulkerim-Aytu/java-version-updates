package com.ceydeo.task;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print All Emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


    }
}
