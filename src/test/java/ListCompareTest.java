import org.example.ListCompare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;


public class ListCompareTest {
    List<Double> list1 = new ArrayList<>();
    @Test
    void testFindAverage() {
        list1.add(10.1);
        list1.add(20.1);
        list1.add(30.1);
        assertThat(ListCompare.Average(list1) == 20.1);
    }

    @Test
    void testEmptyListError(){
        list1.clear();
        assertThatThrownBy(() -> ListCompare.Average(list1)).isInstanceOf(RuntimeException.class);
    }

    @Test
    void testCompareEqualLists(){
        list1.add(10.1);
        list1.add(20.1);
        list1.add(30.1);
        List<Double> list2 = List.copyOf(list1);
        Assertions.assertEquals(ListCompare.CompareList(list1, list2), "Средние значения равны");
    }

    @Test
    void testCompareListsFirstBigger(){
        list1.add(10.1);
        list1.add(20.1);
        list1.add(30.1);
        List<Double> list2 = new ArrayList<>();
        list2.add(3.1);
        list2.add(4.1);
        list2.add(5.1);
        Assertions.assertEquals(ListCompare.CompareList(list1, list2), "Первый список имеет большее среднее значение");
    }

    @Test
    void testCompareListsSecondBigger(){
        list1.clear();
        list1.add(3.1);
        list1.add(4.1);
        list1.add(5.1);
        List<Double> list2 = new ArrayList<>();
        list2.add(10.1);
        list2.add(20.1);
        list2.add(30.1);
        Assertions.assertEquals(ListCompare.CompareList(list1, list2), "Второй список имеет большее среднее значение");
    }
}
