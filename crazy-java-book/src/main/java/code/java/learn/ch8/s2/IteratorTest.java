package code.java.learn.ch8.s2;

import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        list.iterator().forEachRemaining(System.out::println);
    }
}
