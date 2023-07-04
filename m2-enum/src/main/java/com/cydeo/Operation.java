package com.cydeo;

public enum Operation {
    PLUS(1),MINUS(4),MULTIPLE(11),DIVIDE(66);

 private int value;

    Operation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
