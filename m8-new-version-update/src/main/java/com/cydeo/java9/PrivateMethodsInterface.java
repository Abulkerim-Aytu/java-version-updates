package com.cydeo.java9;

import java.time.LocalDate;

public class PrivateMethodsInterface {
//    boolean isHoliday(LocalDate date);


    boolean isBusinessDay(LocalDate date) {

        validate (date);
        return !isHoliday(date);
    }

    LocalDate nextDay(LocalDate date) {
        validate (date);
        if (date.isBefore(LocalDate.of(2001, 1, 1))) {
            throw new IllegalArgumentException();
        }
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }

    private void validate(LocalDate date) {
        if (date.isBefore(LocalDate.of(2001, 1,1))){
            throw new IllegalArgumentException();
        }
    }
}