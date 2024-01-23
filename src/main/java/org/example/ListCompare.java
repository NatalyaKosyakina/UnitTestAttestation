package org.example;

import java.util.List;

public class ListCompare {
    public static double Average(List<Double> list){
        if (list.isEmpty()) {
            throw new RuntimeException("Список пуст");
        }
        double sum = 0;
        for (Double number: list) {
            sum += number;
        }
        return sum/list.size();
    }

    public static String CompareList(List<Double> firstList, List<Double> secondList) {
        if (Average(firstList) > Average(secondList)) {
             return "Первый список имеет большее среднее значение";
        } else if (Average(firstList) == Average(secondList)) {
            return "Средние значения равны";
        } else {
            return "Второй список имеет большее среднее значение";
        }
    }
}
