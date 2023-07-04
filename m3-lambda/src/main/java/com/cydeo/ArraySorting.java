package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSorting bs = new BubbleSorting();

        as.sort(qs);
        as.sort(bs);
    }
    private void sort(Sorting sorting){
        sorting.sort();
    }

}
