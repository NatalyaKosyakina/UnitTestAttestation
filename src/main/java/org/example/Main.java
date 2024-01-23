package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list1 = List.of(new Double[]{10.1, 20.1, 30.1});
        List<Double> list2 = List.of(new Double[]{3.1, 4.1, 5.1});
        System.out.println(ListCompare.CompareList(list1, list2));
    }
}