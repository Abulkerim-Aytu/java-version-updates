package com.cydeo.task;

import lombok.*;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString

@Data // Getter Setter ToString
@AllArgsConstructor

public class User {
    private String firstName;
    private String lastName;
    private int age;

}
