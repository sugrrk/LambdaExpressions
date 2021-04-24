package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Map2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abi","Smith","David","Scott","Abi");
//        //names.stream().map(i->i.length()).forEach(System.out::println);
//        names.stream().map(i->i.toUpperCase()).sorted().distinct().forEach(System.out::println);
//     names.stream().findFirst().filter(i->i.startsWith("S"));
//        System.out.println(names);

       List<String> sort= names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sort);



    }
}
