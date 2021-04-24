package Streams;

import java.util.Arrays;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        List<Integer> f = Arrays.asList(4,5,3,2,6);
        f.stream().map(i->i*3).forEach(System.out::println);
    }
}
